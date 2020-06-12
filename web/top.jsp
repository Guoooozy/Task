<%--
  Created by IntelliJ IDEA.
  User: Guoooozy
  Date: 2020/6/12
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            overflow: hidden;
            border: 1px solid #e7e7e7;
            background-color: #f3f3f3;
        }

        li {
            float: left;
        }

        li a {
            display: block;
            color: #666;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }

        li a:hover:not(.active) {
            background-color: #34ddb1;
        }

        li a.active {
            color: white;
            background-color: #95afac;
        }
    </style>
</head>
<body>
<ul>
    <li><a href="Footer">首页</a></li>
    <li><a href="Logout">注销</a></li>
</ul>
</body>
</html>
