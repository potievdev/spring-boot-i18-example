package com.example.demo;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class Customer {
    @Length(min = 2, max = 40, message = "{i18n.reg.validator.firstName.length}")
    private String firstName;
}
