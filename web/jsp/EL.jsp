<%@ page import="com.entity.Person" %>
<%@ page import="java.util.*" %><%--
  Created by IntelliJ IDEA.
  User: kt20180311
  Date: 2020/7/12
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>El表达式</title>
</head>
<body>
<h3>算法运算符</h3>
${3+4}<br>
${3/4}<br>
${3 div 4}<br>
${3%4}<br>
${3 mod 4}<br>
<h3>比较运算符</h3>
如：${3 == 4}
<h3>逻辑运算符</h3>
如：${3>4 && 4>3}
<h2>获取值，只能从域对象获取值</h2>
<%
    request.setAttribute("name","zhangsan");
    session.setAttribute("nameone","lisi");
%>
<h3>语法1(域对象.键名）:${requestScope.name}
         ${sessionScope.nameone}
</h3>
<h3>语法1（键名）这个会从小到大的域对象查找，只要以查找到就返回第一个，就不再查找:${name}
    ${nameone}
</h3>
<h2>获取对象，list , Map的值</h2>
<h3>获取对象</h3>
<%
    Person person = new Person();
    person.setAge(23);
    person.setName("张三");
    person.setDate(new Date());
    application.setAttribute("user",person);
    List list = new ArrayList();
    list.add("asdd");
    list.add("dsfsfs");
    list.add(person);
    session.setAttribute("list",list);
    Map map = new HashMap();
    map.put("sex","男");
    map.put("user",person);
    session.setAttribute("map",map);
%>
对象:${applicationScope.user.name}${applicationScope.user.age}${applicationScope.user.date}
${applicationScope.msg}<br>
list:集合：${list[0]}   ${list[2].name}<br>
Map集合：${map.sex}  ${map.user.name}<br>
<h3>empty运算符</h3>
${empty list}
${not empty list}<br>
<h2>PageContext隐对象</h2>
${pageContext.request.contextPath}
</body>
</html>
