package az.developia.Person.component.student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.Person.component.student.student;

public interface StudentRopository extends JpaRepository<student, Integer> {

}
