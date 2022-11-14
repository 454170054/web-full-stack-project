<%--
  Created by IntelliJ IDEA.
  User: lzzz
  Date: 2022/10/19
  Time: 22:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>主页面</title>
</head>
<body>
  <c:if test="${User.username==null}">
    暂未登录，请先<a href="loginview">登录</a>
  </c:if>
  <c:if test="${User.username != null}">
    已登录成功，当前用户：${User.username}<br>
    <a href="logout">点击退出登录</a>
  </c:if>
</body>
</html>
