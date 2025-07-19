package az.developia.Person.component.student.ExceptionHandlers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import az.developia.Person.component.our.runtime.exception.OurRuntimeException;
import az.developia.Person.component.student.response.ExceptionResponse;
import az.developia.Person.component.student.response.ValidationResponse;
@RestControllerAdvice
public class ExceptionHandlers {
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public ExceptionResponse handle(OurRuntimeException exc) {
		ExceptionResponse response = new ExceptionResponse();
		BindingResult br = exc.getBr();
		if (br == null) {

		} else {
			List<FieldError> fieldErrors = br.getFieldErrors();
			List<ValidationResponse> validations = new ArrayList<ValidationResponse>();

			for (FieldError fieldError : fieldErrors) {
				ValidationResponse validation = new ValidationResponse();
				validation.setField(fieldError.getField());
				validation.setErrorMessage(fieldError.getDefaultMessage());

				validations.add(validation);

			}

			response.setValidations(validations);

		}

		response.setMessage(exc.getMessage());
		return response;
	}
}
