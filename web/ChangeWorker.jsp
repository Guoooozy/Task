<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/9
  Time: 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更改人员信息</title>
    <link rel="stylesheet" type="text/css" href="css/form.css" />
</head>
<body>
<%@ include file="top.jsp" %>
<div class="container">
    <form action="changeworker" method="post">
        <div class="row">
            <div class="col-25">
                <label for="username">username</label>
            </div>
            <div class="col-75">
                <input type="text" id="username" name="username" placeholder="${param.username}" value="${param.username}" readonly="true">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="name">name</label>
            </div>
            <div class="col-75">
                <input type="text" id="name" name="name" placeholder="${param.name}" value="${param.name}">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="password">password</label>
            </div>
            <div class="col-75">
                <input type="text" id="password" name="password" placeholder="${param.password}" value="${param.password}">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="sex">sex</label>
            </div>
            <div class="col-75">
                <input type="text" id="sex" name="sex" placeholder="${param.sex}" value="${param.sex}">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="birthday">birthday</label>
            </div>
            <div class="col-75">
                <input type="text" id="birthday" name="birthday" placeholder="${param.birthday}" value="${param.birthday}">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="hire_date">hire_date</label>
            </div>
            <div class="col-75">
                <input type="text" id="hire_date" name="hire_date" placeholder="${param.hire_date}" value="${param.hire_date}">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="position">position</label>
            </div>
            <div class="col-75">
                <input type="text" id="position" name="position" placeholder="${param.position}" value="${param.position}">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="qualification">qualification</label>
            </div>
            <div class="col-75">
                <input type="text" id="qualification" name="qualification" placeholder="${param.qualification}" value="${param.qualification}">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="experience">experience</label>
            </div>
            <div class="col-75">
                <input type="text" id="experience" name="experience" placeholder="${param.experience}" value="${param.experience}">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="flag">flag</label>
            </div>
            <div class="col-75">
                <input type="text" id="flag" name="flag" placeholder="${param.flag}" value="${param.flag}">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="super_id">super_id</label>
            </div>
            <div class="col-75">
                <input type="text" id="super_id" name="super_id" placeholder="${param.super_id}" value="${param.super_id}">
            </div>
        </div>
        <div class="row">
            <input type="submit" value="Submit">
        </div>
    </form>
</div>
<%@ include file="footer.jsp" %>
</body>
</html>
