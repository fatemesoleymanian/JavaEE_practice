package com.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("pu");
        EntityManager manager = factory.createEntityManager();

        Student student = manager.find(Student.class,1);

        System.out.println(student);

    }
}