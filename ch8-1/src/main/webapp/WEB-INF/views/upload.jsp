<%--
  Created by IntelliJ IDEA.
  User: lzzz
  Date: 2022/10/23
  Time: 18:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>上传文件</title>
</head>
<body>
<div>
    <form method="post" action="upload" enctype="multipart/form-data" onsubmit="return check()">
        <div style="margin: 2px"><input type="text" name="name" id="name" placeholder="请输入昵称"></div>
        <div style="margin: 2px"><input type="file" name="file" id="file"></div>
        <div style="margin: 2px"><input type="submit" value="提交"></div>
    </form>
</div>
</body>
<script type="text/javascript">
    function check() {
        const name = document.getElementById("name").value;
        const file = document.getElementById("file").value;
        if (name === "") {
            alert("请填写上传人");
        }
        if (file.length === 0 || file === "") {
            alert("请选择上传的文件");
            return false;
        }
        return true;
    }
</script>
</html>
