<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Response Page</title>
</head>
<body bgcolor = "grey">

<%
	String name = request.getParameter("name");
	String location = request.getParameter("location");
	String phone = request.getParameter("no");
%>

<h2>Registration Success</h2><br>
<h3>Details are: </h3>
<table>
<tr>
	<td>Name</td>
	<td><%= name %></td>
</tr>

<tr>
	<td>Location</td>
	<td><%= location %></td>
</tr>

<tr>
	<td>Phone</td>
	<td><%= phone %></td>
</tr>
</table>

</body>
</html>