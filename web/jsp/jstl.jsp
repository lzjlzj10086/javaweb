<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: kt20180311
  Date: 2020/7/12
  Time: 17:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>jstl</title>
</head>
<body>
<%--
    if标签：
     属性：test，必须有，接受Boolean表达式，如果是true进入标签体，false，不显示标签体内容
--%>
<%
    List list = new ArrayList();
    list.add("djdfa");
    session.setAttribute("list",list);
%>
<c:if test="${not empty list}">
    ${list[0]}
</c:if>
</body>
</html>
