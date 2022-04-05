<%-- 
    Document   : register
    Created on : Apr 5, 2022, 1:47:41 AM
    Author     : drago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
        <link href="styles.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <form class="form" action="signup" method="POST">
            <input class="username" type="text" name="username" placeholder="username" required><br>
            <input class="username" type="password" name="password" placeholder="password" required><br>
            <input class="register" name="action" type ="submit" value ="signup">
        </form>
    </body>
</html>
