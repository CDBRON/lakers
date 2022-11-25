<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新</title>
</head>
<body>
<form action="UpdateServlet" method="post">
    <table>
        <tr>
            <td>学号</td>
            <td><input type="text" name="sno" value="<%=request.getParameter("sno")%>"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="text" name="password" value="<%=request.getParameter("password")%>"></td>
        </tr>
        <tr>
            <td>姓名</td>
            <td><input type="text" name="name" value="<%=request.getParameter("name")%>"></td>
        </tr>
    </table>
    <input type="submit" value="确认修改">
</form>
</body>
</html>