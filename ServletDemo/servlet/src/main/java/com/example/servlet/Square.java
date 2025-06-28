package com.example.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "sq",value = "/sq")
public class Square extends HttpServlet {

     @Override
     public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
         PrintWriter out = response.getWriter();

         int sq = 0;
         Cookie[] cookies = request.getCookies();
         for (Cookie c :
                 cookies) {
             if(c.getName().equals("sum")) sq = Integer.parseInt(c.getValue());
         }
         out.println("in cookie square is "+sq);
         //session
//         HttpSession session = request.getSession();
//         int sq = (int)session.getAttribute("sum");
//         out.println("in session square is "+sq);
         // URL rewriting
//         int sq = Integer.parseInt(request.getParameter("sum"));
//         out.println("in url rewriting square "+sq);
         //dispatcher
//         int sq = (int)request.getAttribute("sum") * (int)request.getAttribute("sum");
//         out.println("in dispatcher square is "+sq);

     }
}
