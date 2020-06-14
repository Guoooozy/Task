<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/29
  Time: 22:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>反馈计划</title>
</head>
<body>
<%@ include file="top.jsp" %>
<div class="container">
    <form action="feedPlan" method="post">
        <div class="row">
            <div class="col-25">
                <label for="plan_feedback">plan_feedback</label>
            </div>
            <div class="col-75">
                <input type="text" id="plan_feedback" name="plan_feedback" placeholder="plan_feedback">
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
