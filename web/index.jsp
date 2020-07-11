<%--
  Created by IntelliJ IDEA.
  User: kt20180311
  Date: 2020/7/8
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Servlet</h1>
  <a href="request/demo01">link</a>
  <form action="request/demo02" method="post">
    <input type="text" placeholder="请输入用户名" name="username"/>
    <input type="password" placeholder="请输入密码" name="password"/>
    游戏:<input type="checkbox" name="hobby" value="game" checked/>
    电视:<input type="checkbox" name="hobby" value="tv"/>
    <input type="submit" value="提交">
  </form>
  </body>
</html>
