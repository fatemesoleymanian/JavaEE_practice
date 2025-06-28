package com.example.springwebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to world!";
    }
    @RequestMapping("/about")
    public String about(){
        return "this is about!!!";
    }
}
