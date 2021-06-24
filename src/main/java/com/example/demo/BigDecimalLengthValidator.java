package com.example.demo;

import org.hibernate.validator.internal.engine.constraintvalidation.ConstraintValidatorContextImpl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BigDecimalLengthValidator implements ConstraintValidator<BigDecimalLength, String> {
    private int max;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        boolean isValid = value == null || value.length() <= max;
//        adding message parameter
//        if (!isValid) {
//            String myNewValue = value + " demo";
//            ((ConstraintValidatorContextImpl) context)
//                    .addMessageParameter("wrongValue: ", myNewValue);
//        }
        return isValid;
    }

    @Override
    public void initialize(BigDecimalLength constraintAnnotation) {
        this.max = constraintAnnotation.maxLength();
    }
}
