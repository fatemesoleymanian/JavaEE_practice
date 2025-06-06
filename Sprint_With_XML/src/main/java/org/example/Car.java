package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Car implements Vehicle {
    @Autowired
    private Tyre tyre;
    @Override
    public void drive() {
        System.out.println("car with tyre " +tyre);
    }
}
