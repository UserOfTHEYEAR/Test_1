package az.developia.Person.component.student.Request.dto;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequestDto {
	private Integer id;

	@Size(min = 2, max = 50, message = "Ad min 2 max 50 simvol ola biler")
	private String name;

	@Size(min = 2, max = 50, message = "Soyad min 2 max 50 simvol ola biler")
	private String surname;
	
	private String username;
	private String password;
}
