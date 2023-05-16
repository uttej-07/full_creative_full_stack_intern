<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- This is the JSP page example with scriplets, comments, expressions, declarations --%>
<% out.println("This is a scriplet tag"); %><br/>
<% out.println("The product is: "); %>
<%! int num1 = 12, num2 = 12; %>
<%= num1*num2 %><br/>
Today's date : <%= (new java.util.Date()).toLocaleString() %><br/>
</body>
</html>