package com.electro.electro_app.infraestructure.utils.validation;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Autowired;

import com.electro.electro_app.application.service.ICountryService;

import java.lang.annotation.ElementType;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.lang.annotation.Retention;

public class ExistByCountryNameValidation implements ConstraintValidator<ExistByCountryname,String> {

    @Autowired ICountryService service;

    @Override
    public boolean isValid (String countryname, ConstraintValidatorContext context){
        if (service == null) {
            return true;
        }
        return !service.ExistsByCountryName(countryname);
    }
    
}
