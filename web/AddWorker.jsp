<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/28
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Addworker</title>
    <link rel="stylesheet" type="text/css" href="css/form.css" />
</head>
<body>
<%@ include file="top.jsp" %>
<div class="container">
    <form action="addwoker" method="post">
        <div class="row">
            <div class="col-25">
                <label for="username">username</label>
            </div>
            <div class="col-75">
                <input type="text" id="username" name="username" placeholder="username">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="name">name</label>
            </div>
            <div class="col-75">
                <input type="text" id="name" name="name" placeholder="name">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="password">password</label>
            </div>
            <div class="col-75">
                <input type="text" id="password" name="password" placeholder="password">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="sex">sex</label>
            </div>
            <div class="col-75">
                <input type="text" id="sex" name="sex" placeholder="sex">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="birthday">birthday</label>
            </div>
            <div class="col-75">
                <input type="text" id="birthday" name="birthday" placeholder="birthday">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="hire_date">hire_date</label>
            </div>
            <div class="col-75">
                <input type="text" id="hire_date" name="hire_date" placeholder="hire_date">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="position">position</label>
            </div>
            <div class="col-75">
                <input type="text" id="position" name="position" placeholder="position">
            </div>
        </div>
        <div class="row">
        <div class="col-25">
            <label for="qualification">qualification</label>
        </div>
        <div class="col-75">
            <input type="text" id="qualification" name="qualification" placeholder="qualification">
        </div>
    </div>
        <div class="row">
        <div class="col-25">
            <label for="experience">experience</label>
        </div>
        <div class="col-75">
            <input type="text" id="experience" name="experience" placeholder="experience">
        </div>
    </div>
        <div class="row">
            <div class="col-25">
                <label for="flag">flag</label>
            </div>
            <div class="col-75">
                <input type="text" id="flag" name="flag" placeholder="flag">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="super_id">super_id</label>
            </div>
            <div class="col-75">
                <input type="text" id="super_id" name="super_id" placeholder="super_id">
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
