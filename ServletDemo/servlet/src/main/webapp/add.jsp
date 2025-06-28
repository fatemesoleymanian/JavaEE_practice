<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 6/1/2025
  Time: 2:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add</title>
</head>
<body bgcolor="aqua">
<h1>hello</h1>
<%
//  directive (imports) , declration ( every method or property ouside of service method) ,  scriptlet(service method), expression(out.print )
    int num1 = Integer.parseInt(request.getParameter("num1"));
    int num2 = Integer.parseInt(request.getParameter("num2"));
    int sum = num1 + num2;
    out.println(sum);
<%--    <%= sum %>--%>

%>
</body>
</html>
