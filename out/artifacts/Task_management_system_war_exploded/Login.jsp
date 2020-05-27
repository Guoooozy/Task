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
    <title>Task Management</title>
</head>
<body>
    <form action="Login" method="post">
        姓名：<input type="text" name="username"><br>
        密码：<input type="password" name="password"><br>
        管理员：<input type="radio" name="type" value="1"><br>
        经理：<input type="radio" name="type" value="2"><br>
        员工：<input type="radio" name="type" value="3"><br>
        <input type="submit" value="提交" />
        <input type="Reset" value="重置">
    </form>
</body>
</html>
