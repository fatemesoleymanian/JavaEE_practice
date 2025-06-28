package com.example.servletfilter;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/addAlien")
public class HelloServlet extends HttpServlet {

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("servlet");
        PrintWriter out = response.getWriter();
       String aname = request.getParameter("aname");
       int  aid = Integer.parseInt(request.getParameter("aid"));
       out.println("welcomee "+aname);
    }

    public void destroy() {
    }

}