<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SessionImplicitobject</title>
</head>
<body>
<% String name = request.getParameter("uname");
out.print("Welcome "+name);
session.setAttribute("user",name);
%>
<a href = "SessionImplicitobject2.jsp">Second jsp page </a> 
</body>
</html>