package com.example.springapp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Desktop implements Computer{
    public void  compile(){
        System.out.println("compiling with errors with desktop");
    }
}
