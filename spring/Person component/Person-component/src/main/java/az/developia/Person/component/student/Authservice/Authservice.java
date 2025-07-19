package az.developia.Person.component.student.Authservice;


import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import az.developia.Person.component.our.runtime.exception.OurRuntimeException;
import az.developia.Person.component.student.AuthController.Map;
import az.developia.Person.component.student.AuthController.ResponseEntity;
import az.developia.Person.component.student.JwtUtill.JwtUtill;
import az.developia.Person.component.student.Repository.UserRepository;
import az.developia.Person.component.student.Request.dto.AuthRequestDto;
import az.developia.Person.component.student.user.User;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class Authservice {

	private final UserRepository userRepository; // 123
	private final PasswordEncoder passwordEncoder;
	private final JwtUtill jwtUtill;

public void create(AuthRequestDto dto){
	
	
	User user = new User();
	user.setId(null);
	user.setFirstName(dto.getFirstName());
	user.setLastName(dto.getLastName());
    user.setUsername(dto.getUsername());
	user.setEmail(dto.getEmail());

	String encode = passwordEncoder.encode(dto.getPassword());
	
	user.setPassword(encode);
	
	userRepository.save(user);
}

public String login(AuthRequestDto dto) {
	// TODO Auto-generated method stub
	Optional<User> user = userRepository.findByUsername(dto.getUsername());
	if(!user.isPresent() || !passwordEncoder.matches(dto.getPassword(), user.get().getPassword())) {
		throw new OurRuntimeException(null, "User is not present");
	}
	return jwtUtill.generateToken(user.get().getUsername());
}

public ResponseEntity<Map<String, String>> getUserDetail(String token) {
	
	return null;
}
}