package az.developia.Person.component.student;

public class student {
	
private Integer id;
private  String name;
private String surname;





public student(Integer id, String name, String surname) {
	super();
	this.id=id;
	this.name=name;
	this.surname=surname;
}
@Override
public String toString() {
	return "student [id=" + id + ", name=" + name + ", surname=" + surname + "]";
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}




}
