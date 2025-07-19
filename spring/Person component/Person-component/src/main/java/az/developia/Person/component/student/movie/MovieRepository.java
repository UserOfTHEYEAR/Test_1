package az.developia.Person.component.student.movie;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer>{
List<Movie> findByUserId(Integer id);
}