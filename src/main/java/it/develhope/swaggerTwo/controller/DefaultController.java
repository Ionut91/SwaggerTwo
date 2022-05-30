package it.develhope.swaggerTwo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
    @GetMapping
    public String getWelcome(){
        return "Hello to the localhost:5050/swagger-ui/";
    }
}
