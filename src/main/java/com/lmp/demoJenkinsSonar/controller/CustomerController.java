package com.lmp.demoJenkinsSonar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/customers")
public class CustomerController {

    @GetMapping(path = "/hello")
    public String getHello() {
        return "Hello";
    }
}
