package com.example.RestfulWebService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @GetMapping(path = "/Welcome")
    public String helloWorld(){
        return "Welcome to Spring Boot..";
    }

}
