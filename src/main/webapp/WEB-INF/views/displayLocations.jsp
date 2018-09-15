<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>Locations: </h3>
<table>
	<tr>
		<td>Id</td>
		<td>Code</td>
		<td>Name</td>
		<td>Type</td>
	</tr>
	<c:forEach item="${locations}" var="location">
		<tr>
			<td>${location.id}</td>
			<td>${location.code}</td>
			<td>${location.name}</td>
			<td>${location.type}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>