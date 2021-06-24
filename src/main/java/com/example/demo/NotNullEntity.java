package com.example.demo;

import javax.validation.Valid;

@Valid
public class NotNullEntity {

    @BigDecimalLength(maxLength = 3)
    public String firstString;

    @BigDecimalLength(maxLength = 2)
    public String secondString;
}

