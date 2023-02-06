package org.dongikjo.demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DateValidator implements ConstraintValidator<DateValid, String>{

    @Override
    public void initialize(DateValid constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null ||  value.length() == 0) return true;
        try {
            LocalDate.from(LocalDate.parse(value, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        } catch (DateTimeParseException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
