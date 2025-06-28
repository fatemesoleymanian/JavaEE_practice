package org.example.Dao;

import org.example.model.Book;

import java.sql.*;

public class BookDao {

    public Book getBook(int id) throws ClassNotFoundException {
        Book book = new Book();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/books","root","");
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select * from books where id="+id);
            if (rs.next()){
                book.setId(rs.getInt("id"));
                book.setTitle(rs.getString("title"));
                book.setPrice(rs.getString("price"));
                book.setAuthor(rs.getString("author"));
                book.setCategory(rs.getString("category"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return book;
    }
    public boolean setBook(Book book){
        boolean inserted = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "");
            PreparedStatement statement = connection.prepareStatement("INSERT INTO books (title, price, author, category) VALUES (?,?,?,?) ");
//            statement.setInt(1, book.getId());
            statement.setString(1, book.getTitle());
            statement.setString(2, book.getPrice());
            statement.setString(3, book.getAuthor());
            statement.setString(4, book.getCategory());
            int rowsAffected = statement.executeUpdate();
            inserted = (rowsAffected > 0);

            statement.close();
            connection.close();
        }catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return inserted;

    }
}
