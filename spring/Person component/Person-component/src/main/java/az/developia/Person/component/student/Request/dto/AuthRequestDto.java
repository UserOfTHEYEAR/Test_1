package az.developia.Person.component.student.Request.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthRequestDto {
	private Integer id;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String email;

}
