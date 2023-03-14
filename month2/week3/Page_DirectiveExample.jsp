<%--contentType, info --%>
<%@ page language="java"  contentType="application/msword" charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" info="practice by uttej" buffer ="16kb"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page-Directive</title>
</head>
<body>
<%--Import attribute --%>
<%@ page import ="java.util.Date" %>
Today is: <%= new Date() %>
Today is: <%= new java.util.Date() %>

</body>
</html>