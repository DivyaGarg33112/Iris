package com.springs.validators;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PresentOrFutureValidator.class)
@Documented
public @interface PresentOrFuture {
	
	String message() default "{Date should be today's date or future date}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}