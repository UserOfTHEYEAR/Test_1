package az.developia.Person.component.student.response;

import java.util.List;

import lombok.Data;
@Data
public class ExceptionResponse {
private String message;
	private List<ValidationResponse> validations;
}
