  <%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/29
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更改删除页面</title>
</head>
<body>
<table width="95%" cellspacing="10">
    <tr align="center">
        <td>username</td>
        <td>name</td>
        <td>password</td>
        <td>sex</td>
        <td>birthday</td>
        <td>hire_date</td>
        <td>position</td>
        <td>qualification</td>
        <td>experience</td>
        <td>flag</td>
        <td>super_id</td>
    </tr>

    <c:forEach var="s" items="${list }">
        <tr align="center">
            <td>${s.subjectID }</td>
            <td align="left">${s.subjectTitle }</td>
            <td>${s.subjectAnswer }</td>
            <td><a href="?name=${s.subjectID }">更改</a></td>
            <td><a href="SubjectDeleteServlet?subjectID=${s.subjectID }">删除</a></td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
