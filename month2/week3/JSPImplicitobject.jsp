<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSPImplicitobject</title>
</head>
<body>
<%
out.println("Welcome "+request.getParameter("uname"));
String driver = config.getInitParameter("dname");
out.print("driver name is = "+driver);%>
</body>
</html>