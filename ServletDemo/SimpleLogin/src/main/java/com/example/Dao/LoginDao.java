package com.example.Dao;

import java.sql.*;

public class LoginDao {
    String url = "jdbc:mysql://localhost:3306/login";
    String username = "root";
    String password = "";
    String query = "select * from login where username=? and password=?";

    public boolean check(String username, String password) throws SQLException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,this.username,this.password);
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,username);
            statement.setString(2,password);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) return true;

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
