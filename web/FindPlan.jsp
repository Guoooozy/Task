<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/29
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询计划</title>
    <link rel="stylesheet" type="text/css" href="css/form.css" />
    <link rel="stylesheet" type="text/css" href="css/table.css" />
</head>
<body>
<%@ include file="top.jsp" %>
<div class="container">
    <form action="findPlan" method="post">
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
                <label for="plan_begin_date">plan_begin_date</label>
            </div>
            <div class="col-75">
                <input type="text" id="plan_begin_date" name="plan_begin_date" placeholder="plan_begin_date">
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
            <div class="col-25">
                <label for="feedback">feedback</label>
            </div>
            <div class="col-75">
                <input type="text" id="feedback" name="feedback" placeholder="feedback">
            </div>
        </div>
        <div class="row">
            <input type="submit" value="Submit">
        </div>
    </form>
</div>
    <table id="customers">
        <tr align="center">
            <td>id</td>
            <td>plan_name</td>
            <td>plan_state</td>
            <td>feedback</td>
            <td>plan_begin_date</td>
            <td>plan_end_date</td>
            <td>plan_discription</td>
            <td>plan_feedback</td>
            <td>task_id</td>
        </tr>
        <c:forEach var="s" items="${someplanList}">
            <tr align="center" class="alt">
                <td>${s.id}</td>
                <td>${s.plan_name}</td>
                <td>${s.plan_state}</td>
                <td>${s.feedback}</td>
                <td>${s.plan_begin_date}</td>
                <td>${s.plan_end_date}</td>
                <td>${s.plan_discription}</td>
                <td>${s.plan_feedback}</td>
                <td>${s.task_id}</td>
                <td><a href="changePlan?plan_name=${s.plan_name}&type=change">更改</a></td>
                <td><a href="changePlan?plan_name=${s.plan_name}&type=del">删除</a></td>
            </tr>
        </c:forEach>
    </table>
<%@ include file="footer.jsp" %>
</body>
</html>
