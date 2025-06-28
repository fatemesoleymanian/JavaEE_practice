<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 6/6/2025
  Time: 6:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <title>Todos</title>
</head>
<body>
                                        <%--SQL--%>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/todo_list"
             user="root" password="" />
<sql:query var="resultset" dataSource="${db}" >select * from todos</sql:query>

<%--                                        CORE--%>
<core:forEach items="${resultset.rows}" var="todo">
    <core:out value="${todo.id}" /> : <core:out value="${todo.title}" /> : <core:out value="${todo.checked}" /><br>
</core:forEach>

<%--                                        FUNCTION--%>
<core:set var="str" value="I am a programmar" />
Length : ${fn:length(str)}<br>
<core:forEach items="${fn:split(str, ' ')}" var="word">
    <br>
    ${word}
</core:forEach>
<core:if test="${fn:contains(str, 'I am')}">
      i'm a programmar : <br>
</core:if>

is there i am : ${fn:indexOf(str, "programmar")}<br>
${fn:endsWith(str, "i am")}
</body>
</html>
