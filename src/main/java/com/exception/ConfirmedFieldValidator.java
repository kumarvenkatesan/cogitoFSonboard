package com.exception;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
public class ConfirmedFieldValidator implements ConstraintValidator<ValidateField, String> {
private int min;
private int max;

private boolean required;
private String message;
public void initialize(final ValidateField constraintAnnotation) {

                this.message = constraintAnnotation.message();
                this.min=constraintAnnotation.min();
                this.max=constraintAnnotation.max();
                this.required = constraintAnnotation.required();
            }
            public boolean isValid(final String value, final ConstraintValidatorContext context) {
               if (min>value.length()) {
                   return false;
               }
               if (max>=value.length()) {
                   this.message="maximum length invalid...";
                   return false;
               }
                return true;
            }
}