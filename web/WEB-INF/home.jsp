<%-- 
    Document   : home
    Created on : Oct 8, 2020, 4:10:55 PM
    Author     : 762212
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <h2>Hello ${user.username}</h2>

        <form action="home" method="POST">
                   <a href="login">Logout</a>
        </form>
    </body>
</html>
