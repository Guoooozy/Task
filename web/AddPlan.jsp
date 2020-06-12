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
    <link rel="stylesheet" type="text/css" href="css/form.css" />
</head>
<body>
<%@ include file="top.jsp" %>
<div class="container">
    <form action="addPlan" method="post">
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
                <label for="plan_name">plan_name</label>
            </div>
            <div class="col-75">
                <input type="text" id="plan_name" name="plan_name" placeholder="plan_name">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="plan_state">plan_state</label>
            </div>
            <div class="col-75">
                <input type="text" id="plan_state" name="plan_state" placeholder="plan_state">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="feedback">feedback</label>
            </div>
            <div class="col-75">
                <input type="text" id="feedback" name="feedback" placeholder="feedback">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="plan_begin_date">plan_begin_date</label>
            </div>
            <div class="col-75">
                <input type="text" id="plan_begin_date" name="plan_begin_date" placeholder="plan_begin_date">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="plan_end_date">plan_end_date</label>
            </div>
            <div class="col-75">
                <input type="text" id="plan_end_date" name="plan_end_datev" placeholder="plan_end_date">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="plan_discription">plan_discription</label>
            </div>
            <div class="col-75">
                <input type="text" id="plan_discription" name="plan_discription" placeholder="plan_discription">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="plan_feedback">plan_feedback</label>
            </div>
            <div class="col-75">
                <input type="text" id="plan_feedback" name="plan_feedback" placeholder="plan_feedback">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="task_id">task_id</label>
            </div>
            <div class="col-75">
                <input type="text" id="task_id" name="task_id" placeholder="task_id">
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
