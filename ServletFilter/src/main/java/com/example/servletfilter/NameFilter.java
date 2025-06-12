package com.example.servletfilter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(urlPatterns = "/addAlien")
public class NameFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        System.out.println("name filter");
        HttpServletRequest req = (HttpServletRequest) request;
        String aname = req.getParameter("aname");
        if (aname.length() > 2) chain.doFilter(request, response);
        else out.println("Invalid name input");
    }
}
