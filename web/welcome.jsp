<%-- 
    Document   : welcome
    Created on : Apr 5, 2022, 12:50:19 AM
    Author     : drago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <label>Username:</label>
        <span>${user.username}</span><br>
        <label>Time:</label>
        <span><%
            java.util.Date date=new java.util.Date(); 
            out.print(date);%>
        </span><br>
        <label>IP:</label>
        <span> 
        </span>
    </body>
</html>
