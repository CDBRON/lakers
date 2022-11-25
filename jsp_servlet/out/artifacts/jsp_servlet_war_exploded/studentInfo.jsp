<%@ page import="com.util.StudentUtil" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style type="text/css">
    body{
        background-image: url("https://ts1.cn.mm.bing.net/th/id/R-C.b263a5d1b0782a046400b2da81ea1504?rik=um5nVvfSdWGO8g&riu=http%3a%2f%2fpic1.16xx8.com%2fallimg%2f1nwig2%2f16xx881673a44x26.jpg&ehk=q%2bs%2bL8nYw6LoNqmIyldGVnEU1plc%2b%2fyWlp4GoZkA%2fLY%3d&risl=1&pid=ImgRaw&r=0");
        animation-name: login-animation; /*添加动画名称*/
        animation-duration: 10s; /*动画执行时间*/
        animation-delay:2s; /*动画延时时间*/
        animation-iteration-count: infinite; /*动画播放次数*/
        animation-play-state: running;
    }

    /*添加动画属性*/
    /*@keyframes login-animation {*/
    /*    0%{background: url("https://img.zcool.cn/community/011aad554be56f000001bf72c38864.jpg@1280w_1l_2o_100sh.jpg")}*/
    /*    35%{background: url("https://img.zcool.cn/community/01f6dc5a74149ba80120a12366a277.jpg@1280w_1l_2o_100sh.jpg")}*/
    /*    60%{background: url("https://pic1.zhimg.com/v2-e0ca937a1d3296e7463aa0aa096bef48_r.jpg")}*/
    /*    100%{background:url("https://ts1.cn.mm.bing.net/th/id/R-C.b263a5d1b0782a046400b2da81ea1504?rik=um5nVvfSdWGO8g&riu=http%3a%2f%2fpic1.16xx8.com%2fallimg%2f1nwig2%2f16xx881673a44x26.jpg&ehk=q%2bs%2bL8nYw6LoNqmIyldGVnEU1plc%2b%2fyWlp4GoZkA%2fLY%3d&risl=1&pid=ImgRaw&r=0")}*/
    /*}*/

    .login{
        background: rgba(255,255,255,0.5);
        width:300px;
        margin:300px auto;
    }
</style>
<body>
<div align="center">
<a href="insert.jsp">增加</a>        
<span>用户：<%=session.getAttribute("sno")%></span>        
<span>浏览量：<%=application.getAttribute("count")%></span>
<table>
    <tr>
        <td>学号</td>
        <td>密码</td>
        <td>姓名</td>
        <td></td>
    </tr>
    <%
        for(String s: StudentUtil.map.keySet()){%>
    <tr>
        <td><%=StudentUtil.map.get(s).getSno()%></td>
        <td><%=StudentUtil.map.get(s).getPassword()%></td>
        <td><%=StudentUtil.map.get(s).getName()%></td>
        <td><a href="update.jsp?sno=<%=StudentUtil.map.get(s).getSno()%>&&password=<%=StudentUtil.map.get(s).getPassword()%>&&name=<%=StudentUtil.map.get(s).getName()%>">修改</a>
            <a href="DeleteServlet?sno=<%=StudentUtil.map.get(s).getSno()%>">删除</a></td>
    </tr>
    <% } %>
</table>
</div>
</body>
</html>