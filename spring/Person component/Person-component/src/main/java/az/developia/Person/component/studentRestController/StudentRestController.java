package az.developia.Person.component.studentRestController;

@RestController
@RequestMapping(path ="/api/students")

public class StudentRestController {

	

	@GetMapping
	public List<Student> getStudents(){
	List<Student> students=new ArrayList<Student>();
	students.add(new Student(1,"Aydin","Alkhasli"));
	students.add(new Student(2,"Rashad","Alkhasli"));
	return students;

	}

	@PostMapping(path ="/add")
	public void addStudent(@RequestBodyStudent student) {
	System.out.println(student);


	}

	

	
