package org.dongikjo.demo;

import java.io.UnsupportedEncodingException;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class SmsBytesSizeValidator implements ConstraintValidator<SmsBytesSize, String> {

    @Override
    public void initialize(SmsBytesSize constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        int count = 0;
        try {
            count = value.getBytes("EUC-KR").length;
            addConstraintViolation(
                    context, "90bytes 초과"
            );
            return count < 90 ? true : false;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return true;
    }

    private void addConstraintViolation(ConstraintValidatorContext context, String msg) {
        context.disableDefaultConstraintViolation();
        context.buildConstraintViolationWithTemplate(msg).addConstraintViolation();
    }
}
