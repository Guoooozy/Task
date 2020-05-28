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
</body>
</html>
