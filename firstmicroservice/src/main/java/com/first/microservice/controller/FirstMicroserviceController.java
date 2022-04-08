package com.first.microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is the first microservice.
 */

@RestController
@RequestMapping("/first/microservice/")
public class FirstMicroserviceController {

    @GetMapping("message")
    public String message() {

        return "Hello, Welcome to the first microservice. ";
    }

}
