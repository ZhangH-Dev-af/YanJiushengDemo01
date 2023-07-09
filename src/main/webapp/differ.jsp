<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/10/22
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>重定向与转发区别</title>
</head>
<body>
    <%
        String name=request.getParameter("uname");
        //获取request作用域
        String upwd= (String) request.getAttribute("upwd");

        //输出内容
       System.out.print(name);
       System.out.print("*****");
       System.out.print(upwd);
    %>
</body>
</html>
