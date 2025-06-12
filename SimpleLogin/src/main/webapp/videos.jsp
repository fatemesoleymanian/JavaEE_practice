<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 6/7/2025
  Time: 11:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>videos</title>
</head>
<body>
<%
    response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");//HTTP 1.1
    response.setHeader("Pragma","no-cache");//HTTP 1.0
    response.setHeader("Expires","0");//Proxies

    if(session.getAttribute("username") == null){
        response.sendRedirect("login.jsp");
    }
%>
<h2>Videos</h2>
</body>
</html>
