package com.example.demo;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @PostMapping("/reg")
    public String reg(@Valid @RequestBody Customer customer) {
        return customer.getFirstName();
    }
}
