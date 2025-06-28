<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>

<%
    String url = "jdbc:postgresql://localhost:5432/javaeeprojects";
    String username = "postgres";
    String password = "honey*1379";
    String query = "select * from students where id=100";
    Class.forName("org.postgresql.Driver");
    Connection connection = DriverManager.getConnection(url,username,password);

    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery(query);
    resultSet.next();

%>
Name : <%= resultSet.getString(1)%><br>
ID : <%= resultSet.getInt(2)%><br>
Marks : <%= resultSet.getInt(3)%>
</body>
</html>