<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<form method="POST" action="/addStudent">
		<table>
			<tr>
				<td>Name:<input type="text" name="Studentnamee" /></td>
			</tr>
			<tr>
				<td>ID:<input type="text" name="StudentId" /></td>
			</tr>
			<tr>
				<td>CollegeName:<input type="text" name="CollegeName" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>