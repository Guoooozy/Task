<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/30
  Time: 18:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加任务</title>
</head>
<body>
<%@ include file="top.jsp" %>
<form action="addTask" method="post">
    id:<input type="text" name="id"><br>
    task_name:<input type="text" name="task_name"><br>
    task_begin_time:<input type="text" name="task_begin_time"><br>
    task_end_time:<input type="text" name="task_end_time"><br>
    task_description:<input type="text" name="task_description"><br>
    task_state:<input type="text" name="task_state"><br>
    staff_id:<input type="text" name="staff_id"><br>
    emp_id:<input type="text" name="emp_id"><br>
    <input type="submit" value="提交"/>
    <input type="Reset" value="重置"/>
</form>
<%@ include file="footer.jsp" %>
</body>
</html>
