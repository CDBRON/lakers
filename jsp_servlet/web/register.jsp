<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style type="text/css">
    body{
        background-image: url("https://img.zcool.cn/community/011aad554be56f000001bf72c38864.jpg@1280w_1l_2o_100sh.jpg");
        animation-name: login-animation; /*添加动画名称*/
        animation-duration: 10s; /*动画执行时间*/
        animation-delay:2s; /*动画延时时间*/
        animation-iteration-count: infinite; /*动画播放次数*/
        animation-play-state: running;
    }

    /*添加动画属性*/
    @keyframes login-animation {
        0%{background: url("https://img.zcool.cn/community/011aad554be56f000001bf72c38864.jpg@1280w_1l_2o_100sh.jpg")}
        35%{background: url("https://img.zcool.cn/community/01f6dc5a74149ba80120a12366a277.jpg@1280w_1l_2o_100sh.jpg")}
        60%{background: url("https://pic1.zhimg.com/v2-e0ca937a1d3296e7463aa0aa096bef48_r.jpg")}
        100%{background:url("https://ts1.cn.mm.bing.net/th/id/R-C.b263a5d1b0782a046400b2da81ea1504?rik=um5nVvfSdWGO8g&riu=http%3a%2f%2fpic1.16xx8.com%2fallimg%2f1nwig2%2f16xx881673a44x26.jpg&ehk=q%2bs%2bL8nYw6LoNqmIyldGVnEU1plc%2b%2fyWlp4GoZkA%2fLY%3d&risl=1&pid=ImgRaw&r=0")}
    }

    .login{
        background: rgba(255,255,255,0.5);
        width:300px;
        margin:300px auto;
    }
</style>
<body>
<%--<form action="RegisterServlet" method="post">--%>
<%--    学号：<input type="text" name="sno"><br>--%>
<%--    密码：<input type="text" name="password"><br>--%>
<%--    姓名：<input type="text" name="name"><br>--%>
<%--    <input type="submit" value="确认">--%>
<%--</form>--%>
<div align="center" class="login">
    <h1 align="center">
        欢迎注册
    </h1>
    <form action="RegisterServlet" method="post">
        <table border="0" align="center">
            <tr>
                <td>
                    学号:
                </td>
                <td>
                    <input type="text" name="sno">
                </td>
            </tr>
            <tr>
                <td>
                    密码:
                </td>
                <td>
                    <input type="text" name="password">
                </td>
            </tr>
            <tr>
                <td>
                    姓名:
                </td>
                <td>
                    <input type="text" name="name">
                </td>
            </tr>
            <tr>
                <td>
                </td>
                <td>
                    <input type="submit" value="确认注册">
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>