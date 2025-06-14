package com.example.springapp;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
    public void  compile(){
        System.out.println("compiling with errors with laptop");
    }
}
