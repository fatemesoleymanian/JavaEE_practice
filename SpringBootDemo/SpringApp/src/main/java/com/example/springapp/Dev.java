package com.example.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired //field injection
    @Qualifier("laptop")
    private Computer computer;

    //or

//    @Autowired
//    public Dev(Laptop laptop){ //constructor injection
//        this.laptop = laptop;
//    }

    //or
//    @Autowired
//    public void setLaptop(Laptop laptop) { //setter injection
//        this.laptop = laptop;
//    }

    public void build(){
        computer.compile();
        System.out.println("working on awesome project");
    }
}
