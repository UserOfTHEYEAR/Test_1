package az.developia.Person.component.studentRestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

import az.developia.Person.component.student.student;
import az.developia.Person.component.student.Repository.StudentRopository;

@RestController
@RequestMapping(path ="/api/students")

public class StudentRestController {

	@Autowired
private StudentRopository studentRepository;
	@GetMapping(path="/GetAll")
	public List<student> getStudents(){
	return studentRepository.findAll();
	
	}
	
	@GetMapping(path ="/GetByID/{id}")
		
	public Optional<student> getStudentByID(@PathVariable Integer id) {
		return studentRepository.findById(id);
		
	}
	
	
	
	
	@GetMapping(path ="/search")
	public List<student> serach(@RequestParam(name = "query",required = false) String query){
	List<student> all = studentRepository.findAll();
	if (query == null) {
	return all;

	return all.stream().filter(student -> student.getName().contains(query))
	.collect(Collectors.toList());

	}

	@PostMapping(path ="/add")
	public void addStudent(@RequestBody student student) {
		studentRepository.save(student);


	}
	
	@PutMapping(path = "/update")
	public void update(@Valid @RequestBody Student student,BindingResult br) {
	if (br.hasErrors()) {
	throw new OurRuntimeException(br,"melumatlarin tamliginda problem var");

	if (student.getId() == null || student.getId() <= 0)
	throw new OurRuntimeException(null,"id mutleqdir");
	}

	if (studentRepository.findById(student.getId()).isPresent()) {
	studentRepository.save(student);
	}else {
	throw new OurRuntimeException(null,"id tapilmadi");

	}
	}
	




	@DeleteMapping(path ="/{id}")
	public void deleteStudent(@PathVariable Integer id) {

		studentRepository.deleteById(id);
		
	if (id == null || id <= 0) {
	}

	throw new OurRuntimeException(null, "id mutleqdir");

	Optional<student> byId = studentRepository.findById(id);
	if (byId.isPresent()) {
	return byId.get();
	}
	else {
	throw new OurRuntimeException(null, "id tapilmadi");
}
	}
	
	}

	
