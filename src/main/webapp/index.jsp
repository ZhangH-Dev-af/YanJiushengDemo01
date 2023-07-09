<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>

<%--如果要在jsp些Java代码，需要写在脚本段 --%>
<%
    String name06= (String) request.getAttribute("name");
    System.out.println("06name值为：0"+name06);
    Integer age= (Integer) request.getAttribute("age");
    System.out.println("06age值为："+age);


%>
</body>
</html>