package org.example;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.example.Dao.BookDao;
import org.example.model.Book;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CreateBook", value = "/CreateBook")
public class CreateBook extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        System.out.println("jjjjjjjj");
            String title = request.getParameter("title");
            String category = request.getParameter("category");
            String price = request.getParameter("price");
            String author = request.getParameter("author");


            Book book = new Book();
//             book.setId(56);
            book.setTitle(title);
            book.setCategory(category);
            book.setPrice(price);
            book.setAuthor(author);
            BookDao dao = new BookDao();
            boolean success = dao.setBook(book);
            System.out.println(success);

            if (success) {
                out.println("<h3 style='color:green;'>Book added successfully!</h3>");
            } else {
                out.println("<h3 style='color:red;'>Something went wrong.</h3>");
            }


        out.close();


    }
}
