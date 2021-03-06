<%@page contentType="text/html;charset=utf-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
    <p>学生注册</p>
    <form action="${pageContext.request.contextPath}/servlet/register" method="post">
        <table>
            <tr>
                <td>姓名</td>
                <td><input type="text" name="username" id="username"/></td>
            </tr>
            <tr>
                <td>年龄</td>
                <td><input type="text" name="age" id="age"/></td>
            </tr>
            <tr>
                <td>邮箱</td>
                <td><input type="text" name="email" id="email"/></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="提交"></td>
            </tr>
        </table>
    </form>
</body>
</html>
