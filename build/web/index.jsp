<%-- 
    Document   : index
    Created on : Apr 4, 2022, 10:03:58 PM
    Author     : drago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="styles.css" rel="stylesheet" type="text/css"/>
        <title>Welcome page</title>
    </head>
    <body>
        <form class="form" action="login" method="POST">
            <input class="username" type="text" name="username" placeholder="username"><br>
            <input class="username" type="password" name="password" placeholder="password"><br>
            <input class="login" type ="submit" name="action" value ="login">
            <input class="register" type="submit" name ="action" value="register">
            <p style = "color: red"> ${message} </p>
    </body>
</html>
