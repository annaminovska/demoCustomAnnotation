package com.example.demo;

import org.hibernate.validator.internal.engine.ConstraintViolationImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.io.Console;
import java.util.Set;

@SpringBootApplication
public class DemoApplication {


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        NotNullEntity num = new NotNullEntity();
        num.firstString = "test";
        num.secondString = "demo";

        // validate custom annotation
        var violations = Validation.buildDefaultValidatorFactory().getValidator().validate(num);

        for (ConstraintViolation<NotNullEntity> violation : violations) {
            System.out.println(violation.getMessage());
        }

//        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//        Validator validator = factory.getValidator();
//        Set<ConstraintViolation<NotNullEntity>> violations = validator.validate(num);
    }

}
