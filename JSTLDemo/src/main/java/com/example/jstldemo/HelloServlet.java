package com.example.jstldemo;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // JSTL => JSP Standard Tag Library

        List<Student> students = Arrays.asList(new Student(1,"hanie"),new Student(2,"hossein"));
       Student name = new Student(1,"Hanie");
       request.setAttribute("student",name);
       request.setAttribute("students",students);
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request,response);
    }

    public void destroy() {
    }
}