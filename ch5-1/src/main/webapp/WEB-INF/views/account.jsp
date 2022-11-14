<%--
  Created by IntelliJ IDEA.
  User: lzzz
  Date: 2022/10/10
  Time: 22:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>用户信息列表</h2>
    <table border="1">
        <!--<tr> 标签定义 HTML 表格中的行-->
        <tr>
            <!-- th 标签定义 HTML 表格中的表头单元格-->
            <th>编号</th>
            <th>姓名</th>
            <th>存款</th>
        </tr>
        <c:forEach items="${list}" var="l">
            <tr>
                <!--td 标签 -- 代表HTML表格中的一个单元格 -->
                <td>${l.id}</td>
                <td>${l.name}</td>
                <td>${l.money}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
