<%--
  Created by IntelliJ IDEA.
  User: lzzz
  Date: 2022/10/19
  Time: 22:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
${msg}
<form action="login" method="POST">
    <table>
        <tr>
            <td>用户名：</td>
            <td>
                <label>
                    <input type="text" name="username"/>
                </label>
            </td>
        </tr>
        <tr>
            <td>密码：</td>
            <td>
                <label>
                    <input type="password" name="password">
                </label>
            </td>
        </tr>
    </table>
    <input type="submit" value="登录"/>
</form>
</body>
</html>
