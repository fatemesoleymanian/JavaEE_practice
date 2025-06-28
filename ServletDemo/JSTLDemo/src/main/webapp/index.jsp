<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%
    String name = request.getAttribute("student").toString();
    out.println(name);
%>
<%-- or--%>
${student}
<%--student must be a bean (capsulated)--%>
<br>
<c:out value="HIII ${student.name}"/>
<br>
<c:forEach items="${students}" var="s">
    ${s.name}<br>
</c:forEach>

</body>
</html>