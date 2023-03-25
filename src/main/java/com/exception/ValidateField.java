package com.exception;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Constraint(validatedBy = ConfirmedFieldValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RUNTIME)
@Documented
public @interface ValidateField {
String message() default "Field data Invalid ...";
int min() default 0;
int max() default 255;

boolean required();

    Class <?> [] groups() default {};
    Class <? extends Payload> [] payload() default {};
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface List {
ValidateField[] value();
}
}
