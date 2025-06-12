<%@ page import="org.example.model.Book" %><%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 6/8/2025
  Time: 3:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  Book book = (Book)request.getAttribute("book");
  out.println(book);
%>
<form action="CreateBook" method="post">
    <input type="text" name="id"><br>
        <input type="text" name="title"><br>
        <input type="text" name="category"><br>
        <input type="text" name="author"><br>
        <input type="text" name="price"><br>
    <input type="submit" name="submit"><br>
</form>
</body>
</html>
