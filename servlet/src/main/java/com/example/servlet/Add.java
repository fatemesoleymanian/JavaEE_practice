package com.example.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "add",value = "/add")
public class Add extends HttpServlet {

//    @Override
//    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int sum = num1 + num2;
//
//        PrintWriter out = res.getWriter();
//        out.println(sum);
//
//    }
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int sum = num1 + num2;

        //Cookie
        Cookie cookie = new Cookie("sum",sum+"");
        res.addCookie(cookie);
        res.sendRedirect("sq");
  //session
//        HttpSession session = req.getSession();
//        session.setAttribute("sum",sum);
//        res.sendRedirect("sq");

        //URL rewriting
//        res.sendRedirect("sq?sum="+sum);
        //dispatcher
//        req.setAttribute("sum",sum);
//        RequestDispatcher dispatcher = req.getRequestDispatcher("sq");
//        dispatcher.forward(req,res);

    }
}
