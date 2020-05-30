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
</head>
<body>

<form action="findPlan" method="post">
    plan_name:<input type="text" name="plan_name">
    plan_begin_date:<input type="text" name="plan_begin_date">
    task_id:<input type="text" name="task_id">
    feedback:<input type="text" name="feedback">
    <input type="submit" value="提交"/>
    <input type="Reset" value="重置"/>
    以下是查询结果：
</form>
    <table>
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
            <tr align="center">
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
</body>
</html>
