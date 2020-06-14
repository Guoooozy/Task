<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/30
  Time: 19:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>部门人员</title>
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

    <c:forEach var="s" items="${PartWorkers}">
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
        </tr>
    </c:forEach>
    <%@ include file="footer.jsp" %>
</table>
</body>
</html>
