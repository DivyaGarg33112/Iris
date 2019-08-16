package com.springs.validators;


import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import com.springs.models.Employee;

@Component
public class NameValidator implements Validator{

	@Override
	public boolean supports(Class<?> obj) {
				return Employee.class.isAssignableFrom(obj);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "employeeName", "name.required");
		Employee emp=(Employee)target;
		if(!emp.getEmployeeName().matches("Divya|Ragini|Nilam|Priyanka|Sagnicka")){
			System.out.println("I m in if");
			//errors.reject("name.required","Name must be from the list only");
			errors.rejectValue("employeeName","name.correct");
		}
		else {
			System.out.println("I m in else");
		}
	
	}

}
