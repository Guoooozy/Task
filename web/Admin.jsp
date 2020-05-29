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
</head>
<body>
<form action="Admin" method="post">
    <p>选择你要使用的功能</p>
    <input type="radio" name="type" value="add"/>添加人员<br>
    <input type="radio" name="type" value="del"/>删除人员<br>
    <input type="radio" name="type" value="change"/>更改人员属性<br>
    <input type="submit" value="提交"/>
    <input type="Reset" value="重置"/>
</form>
<table width="95%" cellspacing="10">
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
    <tr align="center">
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
        <td><a href="DelWorker?name=${s.name}&type=change">更改</a></td>
        <td><a href="DelWorker?name=${s.name}&type=del">删除</a></td>
    </tr>
    </c:forEach>
</body>
</html>
