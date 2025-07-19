package az.developia.Person.component.studentRestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import az.developia.Person.component.our.runtime.exception.OurRuntimeException;
import az.developia.Person.component.student.student;
import az.developia.Person.component.student.Repository.StudentRopository;
import az.developia.Person.component.student.Request.dto.StudentRequestDto;
import jakarta.validation.Valid;

@RestControllerAdvice

@RestController
@RequestMapping(path = "/api/students")

public class StudentRestController {
	

	@Autowired
	private StudentRopository studentRepository;

	@GetMapping(path = "/telebeler")
	public String showStudents(@RequestParam(name = "q", required = false, defaultValue = "") String q) {
		List<String> students = new ArrayList<String>();
		students.add("Aydin");
		students.add("Elsad");
		students.add("Elirahim");
		students.add("Fexriyye");

		List<String> studentsFiltered = new ArrayList<String>();
		for (String student : students) {
			if (student.equalsIgnoreCase(q)) {
				studentsFiltered.add(student);

			}
			System.out.println(studentsFiltered);

		}
		return "students";
	}


	@GetMapping(path = "/GetAll")
	public List<student> getStudents() {
		return studentRepository.findAll();

	}

	@GetMapping(path = "/GetByID/{id}")

	public Optional<student> getStudentByID(@PathVariable Integer id) {
		return studentRepository.findById(id);

	}

	@GetMapping(path = "/search")
	public List<student> serach(@RequestParam(name = "query", required = false) String query) {
		List<student> all = studentRepository.findAll();
		if (query == null) {
			return all;
		}
		return all.stream().filter(student -> student.getName().contains(query)).collect(Collectors.toList());
	}

	@PostMapping(path = "/add")
	public void addStudent(@Valid @RequestBody StudentRequestDto dto, BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRuntimeException(br, "melumatlarin tamliginda problem var");
		}

		student s = new student();
		s.setId(null);
		s.setName(dto.getName());
		s.setSurname(dto.getSurname());
		studentRepository.save(s);
		
	}

	@PutMapping(path = "/update")
	public void update(@Valid @RequestBody student student, BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRuntimeException(br, "melumatlarin tamliginda problem var");
		}
		if (student.getId() == null || student.getId() <= 0) {
			throw new OurRuntimeException(null, "id mutleqdir");
		}

		if (studentRepository.findById(student.getId()).isPresent()) {
			studentRepository.save(student);
		} else {
			throw new OurRuntimeException(null, "id tapilmadi");

		}
	}

	@DeleteMapping(path = "/{id}")
	public void deleteStudent(@PathVariable Integer id) {

		if (id == null || id <= 0) {
			throw new OurRuntimeException(null, "id mutleqdir");

		}

		if (studentRepository.findById(id).isPresent()) {
			studentRepository.deleteById(id);
		} else {
			throw new OurRuntimeException(null, "id tapilmadi");
		}
	}

}
