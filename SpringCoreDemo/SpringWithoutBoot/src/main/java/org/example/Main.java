package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Dev dev = context.getBean(Dev.class);
//        System.out.println(dev.getAge());
        dev.compile();
    }
}