<%--
  Created by IntelliJ IDEA.
  User: lzzz
  Date: 2022/10/16
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h2>修改用户信息</h2>
  <form action="update">
    <table>
      <tr>
        <td>用户名：</td>
        <td>
          <input name="name" value="${user.name}" type="text">
        </td>
      </tr>
      <tr>
        <td>年  龄：</td>
        <td>
          <input name="age" value="${user.age}" type="text">
        </td>
      </tr>
      <tr>
        <td colspan="2">
          <button type="submit">提交</button>
        </td>
      </tr>
    </table>
  </form>
</body>
</html>
