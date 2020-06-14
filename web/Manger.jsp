<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/30
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>经理界面</title>
    <link rel="stylesheet" type="text/css" href="css/form.css" />
</head>
<body>
<%@ include file="top.jsp" %>
<div class="row">
    <div style="height: 100px;width:20%;text-align: center;float: left"></div>
    <div style="height: 100px;width:20%;text-align: center;float: left">
        <a href="AddTask.jsp">制定任务</a>
    </div>
    <div style="height: 100px;width: 20%;text-align: center;float: left">
    <a href="ShowTask.jsp">查看任务</a>
    </div>
    <div style="height: 100px;width: 20%;text-align: center;float: left">
    <a href="ShowWorker.jsp">查看人员</a>
    </div>
    <div style="height: 100px;width:20%;text-align: center;float: left"></div>
</div>
</table>
<%@ include file="footer.jsp" %>
</body>
</html>
