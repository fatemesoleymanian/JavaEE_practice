package com.example.servletfilter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(urlPatterns = "/addAlien")
public class IdFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {

    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        System.out.println("filter");
        HttpServletRequest req = (HttpServletRequest) request;
        int aid = Integer.parseInt(req.getParameter("aid"));
        if (aid > 1) chain.doFilter(request, response);
        else out.println("Invalid id input");
    }
}
