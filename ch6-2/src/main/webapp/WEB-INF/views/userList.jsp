<%--
  Created by IntelliJ IDEA.
  User: lzzz
  Date: 2022/10/16
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>展示用户列表</h2>
    <table border="1">
        <tr>
            <th>id</th>
            <th>姓名</th>
            <th>年龄</th>
        </tr>
        <c:forEach items="${users}" var="l">
            <tr>
                <td>${l.id}</td>
                <th>${l.name}</th>
                <th>${l.age}</th>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
