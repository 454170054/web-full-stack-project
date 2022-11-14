<%--
  Created by IntelliJ IDEA.
  User: lzzz
  Date: 2022/10/30
  Time: 21:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查看所有学生信息</title>
    <link rel="stylesheet" type="text/css" href="static/bootstrap-3.4.1-dist/css/bootstrap.css">
</head>
<body>
<div>
    <div class="col-md-3"></div>
    <div class="col-md-6">
        <table class="table">
            <tr>
                <th>学号</th>
                <th>姓名</th>
                <th>性别</th>
                <th>年纪</th>
                <th>部门</th>
                <th>班级</th>
            </tr>
            <c:forEach items="${students}" var="s">
                <tr>
                    <td>${s.stuId}</td>
                    <td>${s.stuName}</td>
                    <td>${s.sex}</td>
                    <td>${s.grade}</td>
                    <td>${s.dept}</td>
                    <td>${s.classname}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <div class="col-md-3"></div>
</div>

</body>
</html>
