<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<%
    String user = (String) session.getAttribute("user");
    if(user == null){
        response.sendRedirect("login.html");
    }
%>
    <h1>Welcome, <%= user %></h1>
</body>
</html>