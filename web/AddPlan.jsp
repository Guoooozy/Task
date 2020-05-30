<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/29
  Time: 22:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加计划</title>
</head>
<body>
<form action="addPlan" method="post">
    id:<input type="text" name="id"><br>
    plan_name:<input type="text" name="plan_name"><br>
    plan_state:<input type="text" name="plan_state"><br>
    feedback:<input type="text" name="feedback"><br>
    plan_begin_date:<input type="text" name="plan_begin_date"><br>
    plan_end_date:<input type="text" name="plan_end_date"><br>
    plan_discription:<input type="text" name="plan_discription"><br>
    plan_feedback:<input type="text" name="plan_feedback"><br>
    task_id:<input type="text" name="task_id"><br>
    <input type="submit" value="提交"/>
    <input type="Reset" value="重置"/>
</form>
<%@ include file="footer.jsp" %>
</body>
</html>
