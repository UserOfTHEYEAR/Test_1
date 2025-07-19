package az.developia.Person.component.student.AuthController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.Person.component.our.runtime.exception.OurRuntimeException;
import az.developia.Person.component.student.Authservice.Authservice;
import az.developia.Person.component.student.Request.dto.AuthRequestDto;
import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/auth")
@CrossOrigin(origins = "*")
public class AuthController {
	
	@Autowired
	private Authservice service;

	@PostMapping(path = "/register")
	public void createUser(@Valid @RequestBody AuthRequestDto dto,BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRuntimeException(br,"");
		}
		service.create(dto);
	}
	@PostMapping(path = "/login")
	public String login(@RequestBody AuthRequestDto dto) {
		return service.login(dto);


	}
	@GetMapping(path ="/profile")
	public ResponseEntity<Map<String, String>>getUserDetails(@RequestHeader("Authorization") String token){
         return service.getUserDetail(token);
	
}}
	


