<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/30
  Time: 18:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>任务展示</title>
    <link rel="stylesheet" type="text/css" href="css/table.css" />
</head>
<body>
<%@ include file="top.jsp" %>
<table id="customers">
    <tr align="center">
        <td>id</td>
        <td>task_name</td>
        <td>task_begin_time</td>
        <td>task_end_time</td>
        <td>task_description</td>
        <td>task_state</td>
        <td>staff_id</td>
        <td>emp_id</td>
    </tr>


    <c:forEach var="s" items="${taskList}">
    <tr align="center" class="alt">
        <td>${s.id}</td>
        <td>${s.task_name}</td>
        <td>${s.task_begin_time}</td>
        <td>${s.task_end_time}</td>
        <td>${s.task_description}</td>
        <td>${s.task_state}</td>
        <td>${s.staff_id}</td>
        <td>${s.emp_id}</td>
        <td><a href="changeTask?task_name=${s.task_name}">调整任务</a></td>
    </tr>
    </c:forEach>
    <%@ include file="footer.jsp" %>
</body>
</html>
