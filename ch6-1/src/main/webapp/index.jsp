<%@page language="java" pageEncoding="utf-8" contentType="text/html" %>
<html>
<body>
<h2>添加用户信息</h2>
<div>
    <form action="add1">
        <table>
            <tr>
                <td>用户名：</td>
                <td><input name="name" type="text"></td>
            </tr>
            <tr>
                <td>年龄：</td>
                <td><input name="age" type="text"></td>
            </tr>
            <td>存款金额</td>
            <td>
                <input type="checkbox" name="hobby" value="游泳">游泳<br/>
                <input type="checkbox" name="hobby" value="唱歌">唱歌<br/>
                <input type="checkbox" name="hobyy" value="跳舞">跳舞<br/>
            </td>
            <tr>
                <td colspan="2" align="center">
                    <button type="submit">
                        提交
                    </button>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
