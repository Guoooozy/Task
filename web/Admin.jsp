<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/28
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin</title>
    <link rel="stylesheet" type="text/css" href="css/table.css" />
</head>

<body>
<%@ include file="top.jsp" %>
<table id="customers">
    <tr align="center">
        <td>username</td>
        <td>name</td>
        <td>password</td>
        <td>sex</td>
        <td>birthday</td>
        <td>hire_date</td>
        <td>position</td>
        <td>qualification</td>
        <td>experience</td>
        <td>flag</td>
        <td>super_id</td>
    </tr>

    <c:forEach var="s" items="${list}">
    <tr align="center" class="alt">
        <td>${s.username}</td>
        <td>${s.name}</td>
        <td>${s.password}</td>
        <td>${s.sex}</td>
        <td>${s.birthday}</td>
        <td>${s.hire_date}</td>
        <td>${s.position}</td>
        <td>${s.qualification}</td>
        <td>${s.experience}</td>
        <td>${s.flag}</td>
        <td>${s.super_id}</td>
        <td><a href="ChangeWorker.jsp?username=${s.username}&name=${s.name}&password=${s.password}&sex=${s.sex}&birthday=${s.birthday}&hire_date=${s.hire_date}&position=${s.position}&qualification=${s.qualification}&experience=${s.experience}&flag=${s.flag}&super_id=${s.super_id}">更改</a></td>
        <td><a href="DelWorker?name=${s.name}">删除</a></td>
    </tr>
    </c:forEach>
</table>
<a href="AddWorker.jsp">添加人员</a>
<%@ include file="footer.jsp" %>
</body>
</html>
