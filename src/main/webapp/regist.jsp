<%--
  Created by IntelliJ IDEA.
  User: 86166
  Date: 2019/5/24
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>用户注册的页面</h1>
<
<form action="/register" method="post">
    <table width="600" border="1">
        <tr>
            <td>用户名</td>
            <td><input type="text" name = "username"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="text" name = "password"></td>
        </tr>
        <tr>
            <td>昵称</td>
            <td><input type="text" name = "nickname"></td>
        </tr>
        <tr>
            <td>邮箱</td>
            <td><input type="text" name = "email"></td>
        </tr>
        <tr>

            <td colspan="2"><input type="submit" value="注册" ></td>
        </tr>
    </table>
</form>
</body>
</html>
