<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" errorPage="error.jsp" %>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<%
    int i = 4;
    int k = i / 0;


%>
<%
    out.println(3+9);
%>
my num is <%
    out.println(i);
%>
</body>
</html>