<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>测试JSON交互——提交JSON数据</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery/jquery-1.11.3.min.js"></script>

</head>
<body>
<h2>修改用户信息</h2>
<form>
    用户名：<input name="name" type="text" id="name"><br/>
    年 龄：<input name="age" type="text" id="age"><br/>
    <input type="button" onclick="testJson()" value="提交Json数据"></input>
</form>
<div id="msg"></div>
</body>
<script type="text/javascript">
    function testJson() {
        //获取输入的客户姓名和年龄
        const name = $("#name").val();
        const age = $("#age").val();
        $.ajax(
            {
                //请求的url
                url: "${pageContext.request.contextPath}/update",
                //请求方式
                type: "post",
                //请求数据
                data: JSON.stringify({name:name, age:age}),
                //定义发送请求的数据类型
                contentType: "application/json;charset=UTF-8",
                //成功响应后的处理
                success: function (data){
                    if(data != null){
                        $("#msg").empty();
                        $("#msg").append("从控制台返回的JSON数据：" + JSON.stringify(data) + "客户姓名：" + data.name + "年龄为：" + data.age);
                    }
                }
            }
        );
    }
</script>
</html>
