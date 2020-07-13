<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="com.entity.Person" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: kt20180311
  Date: 2020/7/13
  Time: 12:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>jstl表格练习</title>
</head>
<body>
<%
    List user = new ArrayList();
    user.add(new Person("龙兄",23,new Date()));
    user.add(new Person("华源",20,new Date()));
    user.add(new Person("杰哥",22,new Date()));
    user.add(new Person("吃鸡",13,new Date()));
    session.setAttribute("list",user);
%>
<table align="center" border="1" width="500">
    <tr>
        <td>number</td>
        <td>name</td>
        <td>age</td>
        <td>date</td>
    </tr>
    <c:forEach items="${list}" var="user" varStatus="s">
        <tr>
            <td>${s.count}</td>
            <td>${user.name}</td>
            <td>${user.age}</td>
            <td>${user.date}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
