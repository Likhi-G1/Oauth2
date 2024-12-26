package com.oath2.validationservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/login")
@RestController
public class AuthController {

    @GetMapping("/home")

    public String Test(){
        return "Hello Oauth2";
    }
}
