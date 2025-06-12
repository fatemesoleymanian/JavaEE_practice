package com.example.simplelogin;

import java.io.*;
import java.sql.SQLException;

import com.example.Dao.LoginDao;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/Login")
public class Login extends HttpServlet {

    public void init() {
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        LoginDao loginDao = new LoginDao();

        try {
            if (loginDao.check(username,password)){
                HttpSession session = request.getSession();
                session.setAttribute("username",username);
                response.sendRedirect("welcome.jsp");
            }else response.sendRedirect("login.jsp");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void destroy() {
    }
}