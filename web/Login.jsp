<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/27
  Time: 22:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
    <link rel="stylesheet" type="text/css" href="css/form.css" />
</head>
<body>
<div class="container">
    <form action="Login">
        <div class="row">
            <div class="col-25">
                <label for="fname">Username</label>
            </div>
            <div class="col-75">
                <input type="text" id="fname" name="username" placeholder="Your username..">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="lname">Password</label>
            </div>
            <div class="col-75">
                <input type="text" id="lname" name="password" placeholder="Your password..">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="country">Country</label>
            </div>
            <div class="col-75">
                <select id="country" name="type">
                    <option value="1">管理员</option>
                    <option value="2">经理</option>
                    <option value="3">员工</option>
                </select>
            </div>
        </div>
        <div class="row">
            <input type="submit" value="Submit">
        </div>
    </form>
</div>

</body>
</html>
