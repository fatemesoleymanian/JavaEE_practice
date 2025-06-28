package org.example;

import org.example.Dao.BookDao;
import org.example.model.Book;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "getBook", value = "/getBook")
public class GetBook extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        BookDao dao = new BookDao();
        Book book = null;
        try {
            book = dao.getBook(id);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

//        System.out.println(book);
        request.setAttribute("book",book);
        RequestDispatcher rd = request.getRequestDispatcher("showBook.jsp");
        rd.forward(request,response);
    }

}
