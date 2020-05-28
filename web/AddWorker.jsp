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
</head>
<body>
    <form action="addwoker" method="post">
        <p>输入人员的信息</p>
        username:<input type="text" name="username"><br>
        name：<input type="text" name="name"><br>
        password:<input type="text" name="password"><br>
        sex:<input type="text" name="sex"><br>
        birthday:<input type="text" name="birthday"><br>
        hire_date:<input type="text" name="hire_date"><br>
        position:<input type="text" name="position"><br>
        qualification:<input type="text" name="qualification"><br>
        experience:<input type="text" name="experience"><br>
        flag:<input type="text" name="flag"><br>
        super_id:<input type="text" name="super_id"><br>
        <input type="submit" value="提交"/>
        <input type="Reset" value="重置"/>
    </form>
</body>
</html>
