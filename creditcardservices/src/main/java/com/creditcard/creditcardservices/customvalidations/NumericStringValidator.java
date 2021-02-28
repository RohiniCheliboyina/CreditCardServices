package com.creditcard.creditcardservices.customvalidations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.creditcard.creditcardservices.constants.CreditCardValidationMessages;

public class NumericStringValidator implements ConstraintValidator<NumericCheck, String> {

	
	    @Override
	    public boolean isValid(String str, ConstraintValidatorContext constraintValidatorContext) {
	        if (str.matches(CreditCardValidationMessages.DIGITS_CHECK)) return true;
	        return false;
	    }
	    
	}

