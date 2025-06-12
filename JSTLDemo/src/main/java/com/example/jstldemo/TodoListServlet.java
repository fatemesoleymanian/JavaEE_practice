package com.example.jstldemo;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "todos", value = "/todos")
public class TodoListServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // JSTL => JSP Standard Tag Library


        RequestDispatcher rd = request.getRequestDispatcher("todos.jsp");
        rd.forward(request,response);
    }

}