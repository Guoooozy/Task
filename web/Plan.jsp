<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/29
  Time: 22:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Plan</title>
    <link rel="stylesheet" type="text/css" href="css/table.css" />
</head>
<body>
<%@ include file="top.jsp" %>
    <a href="AddPlan.jsp">制定计划</a><br>
    <a href="FindPlan.jsp">查询计划</a><br>

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


        <c:forEach var="s" items="${planList}">
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
                <td><a href="changePlan?plan_name=${s.plan_name}&type=change">更新反馈信息</a></td>
                <td><a href="changePlan?plan_name=${s.plan_name}&type=del">删除</a></td>
            </tr>
        </c:forEach>
    </table>
    <%@ include file="footer.jsp" %>
</body>
</html>
