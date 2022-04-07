<%@page import="com.shakil.web.model.AlianData"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">

	<%
// faching object of alianData ; 
AlianData alian = (AlianData) request.getAttribute("alian");
out.println(alian);
%>
</body>
</html>