package az.developia.Person.component.student.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.Person.component.student.user.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	Optional<User> findByUsername(String username);

	User getUserByUsername(String username);

}
