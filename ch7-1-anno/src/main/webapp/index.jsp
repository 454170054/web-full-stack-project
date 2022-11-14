<%@page language="java" contentType="text/html" pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>拦截器</title>
</head>
<body>
<a href="hello">请求拦截测试（被UserInterceptor和MyInterceptor拦截）</a><br>
<a href="hello1">请求放行测试（被全局拦截器UserInterceptor拦截，指定拦截器MyInterceptor放行）</a><br>
<h3>${msg}</h3>
</body>
</html>
