package az.developia.Person.component.exception.holder;

import java.util.List;

public class ExceptionHolder {




public ExceptionResponse handler(OurRuntimeException exc) {

ExceptionResponse response=new ExceptionResponse();

BindingResult br = exc.getBr();
if (br == null) {

} else {
List<FieldError> fieldErrors = br.getFieldErrors();
List<ValidationResponse> validations=new ArrayList<ValidationResponse>();
for(FieldError error:fieldErrors) {
ValidationResponse validation=new ValidationResponse();
validation.setField(error.getField());
validation.setErrorMessage(error.getDefaultMessage());
validations.add(validation);

response.setValidations(validations);

return exc.getBr().getFieldErrors().get(0).getDefaultMessage();

response.setMessage(exc.getMessage());
return response;

}
}
}
}