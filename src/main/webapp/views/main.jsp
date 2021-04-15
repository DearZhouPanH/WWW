<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021\4\14 0014
  Time: 18:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<table cellspacing="0" border="1" class="table1">
    <thead>
    <tr>
        <th width="300">ID</th>
        <th width="300">名字</th>

    </tr>
    </thead>
    <tbody>

    <c:forEach var="p" items="${requestScope.personlist }">
        <tr>
            <td align="center">${p.id }</td>
            <td align="center">${p.name }</td>

        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
