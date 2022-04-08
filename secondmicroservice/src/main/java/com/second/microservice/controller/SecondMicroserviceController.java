package com.second.microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is the second microservice.
 */
@RestController
@RequestMapping("/second/microservice/")
public class SecondMicroserviceController {

    @GetMapping("message")
    public String message() {
        return "Hello, Welcome to the second microservice. ";
    }

}
