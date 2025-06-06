package com.example.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "my",value = "/my",initParams = {
        @WebInitParam(name = "name", value = "hossein")
})
public class MyServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();

        //ServletContext
        ServletContext context = getServletContext();
        String scx = context.getInitParameter("name");
        writer.println("ServletContext: "+scx+" it's a variable per context (for many servlets)");

        //ServletConfig
        ServletConfig config = getServletConfig();
        String scg = config.getInitParameter("name");
        writer.println("ServletConfig: "+scg+" it's a variable per servlet");

    }
}
