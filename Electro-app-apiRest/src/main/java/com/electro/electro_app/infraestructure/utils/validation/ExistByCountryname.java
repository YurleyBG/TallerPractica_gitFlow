package com.electro.electro_app.infraestructure.utils.validation;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Retention;

@Constraint(validatedBy = ExistByCountryNameValidation.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ExistByCountryname {
    String message() default "Ya existe en la base de datos. Escoja otro Username.";

    Class<?>[] groups() default {};

    Class <? extends Payload>[] payload() default {};
}
