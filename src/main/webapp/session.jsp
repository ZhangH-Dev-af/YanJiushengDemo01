<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/10/23
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取域对象</title>
</head>
<body>
<%
    //获取session域对象
    String uname= (String) request.getSession().getAttribute("uname");
    String upwd= (String) request.getSession().getAttribute("upwd");
    //获取request对象
    String name= (String) request.getAttribute("name");
    System.out.println("session里面uname:"+uname);
    System.out.println("session里面upwd"+upwd);
    System.out.println("request里面name"+name);
%>
</body>
</html>
