package com.springs.validators;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

@Component
public class PresentOrFutureValidator
implements ConstraintValidator<PresentOrFuture, LocalDate> {


	public final void initialize(final PresentOrFuture annotation) {

	}

public final boolean isValid(final LocalDate value,
    final ConstraintValidatorContext context) {

	
	System.out.println("I m is Valid : "+value);
    LocalDate today = LocalDate.now();

    if( (value.compareTo(today))==0 || (value.compareTo(today)>0) ){
    	return true;
    }
    else {
    	return false;
    }

}
}