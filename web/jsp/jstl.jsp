<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.sun.org.apache.xalan.internal.res.XSLTErrorResources_es" %><%--
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
     choose标签：
      when
      otherwise
     foreach标签，
        属性：items，
            var
            varstatus：index count
            begin
            end
            step
--%>
<%
    List list = new ArrayList();
    list.add("djdfa");
    list.add("jfvsk");
    list.add("ndhioad");
    session.setAttribute("list",list);
    session.setAttribute("number",7);
%>
<c:if test="${not empty list}">
    ${list[0]}
</c:if>
<c:choose>
    <c:when test="${number == 1}">星期一</c:when>
    <c:when test="${number == 2}">星期二</c:when>
    <c:when test="${number == 3}">星期三</c:when>
    <c:when test="${number == 4}">星期四</c:when>
    <c:when test="${number == 5}">星期五</c:when>
    <c:when test="${number == 6}">星期六</c:when>
    <c:when test="${number == 7}">星期天</c:when>
    <c:otherwise>数字输入有误</c:otherwise>
</c:choose>
<c:forEach items="${list}" var="value">
    ${value}
</c:forEach>
</body>
</html>
