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
</head>
<body>
<form action="changeworker" method="post">
    <p>输入人员的信息</p>
    username:<input type="text" name="username" value="${param.username}"><br>
    name：<input type="text" name="name"  value="${param.name}"><br>
    password:<input type="text" name="password" value="${param.password}"><br>
    sex:<input type="text" name="sex" value="${param.sex}"><br>
    birthday:<input type="text" name="birthday" value="${param.birthday}"><br>
    hire_date:<input type="text" name="hire_date" value="${param.hire_date}"><br>
    position:<input type="text" name="position" value="${param.position}"><br>
    qualification:<input type="text" name="qualification" value="${param.qualification}"><br>
    experience:<input type="text" name="experience" value="${param.experience}"><br>
    flag:<input type="text" name="flag" value="${param.flag}"><br>
    super_id:<input type="text" name="super_id" value="${param.super_id}"><br>
    <input type="submit" value="提交"/>
    <input type="Reset" value="重置"/>
</form>
<%@ include file="footer.jsp" %>
</body>
</html>
