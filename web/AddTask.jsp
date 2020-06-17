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
    <link rel="stylesheet" type="text/css" href="css/form.css" />
</head>
<body>
<%@ include file="top.jsp" %>
<div class="container">
    <form action="addTask" method="post">
        <div class="row">
            <div class="col-25">
                <label for="id">id</label>
            </div>
            <div class="col-75">
                <input type="text" id="id" name="id" placeholder="id">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="task_name">task_name</label>
            </div>
            <div class="col-75">
                <input type="text" id="task_name" name="task_name" placeholder="task_name">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="task_begin_time">task_begin_time</label>
            </div>
            <div class="col-75">
                <input type="text" id="task_begin_time" name="task_begin_time" placeholder="plan_state">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="task_end_time">task_end_time</label>
            </div>
            <div class="col-75">
                <input type="text" id="task_end_time" name="task_end_time" placeholder="task_end_time">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="task_description">task_description</label>
            </div>
            <div class="col-75">
                <input type="text" id="task_description" name="task_description" placeholder="task_description">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="task_state">task_state</label>
            </div>
            <div class="col-75">
                <input type="text" id="task_state" name="task_state" placeholder="task_state">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="staff_id">staff_id</label>
            </div>
            <div class="col-75">
                <input type="text" id="staff_id" name="staff_id" placeholder="staff_id">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="emp_id">emp_id</label>
            </div>
            <div class="col-75">
                <input type="text" id="emp_id" name="emp_id" placeholder="emp_id" value="${worker.username}" readonly="true">
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
