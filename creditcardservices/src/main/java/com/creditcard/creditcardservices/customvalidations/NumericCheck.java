package com.creditcard.creditcardservices.customvalidations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.creditcard.creditcardservices.constants.CreditCardValidationMessages;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {NumericStringValidator.class})
@Documented
public @interface NumericCheck {

	String message() default CreditCardValidationMessages.IS_NOT_NUMERIC;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
