<%-- 
    Document   : login
    Created on : Oct 8, 2020, 4:11:10 PM
    Author     : 762212
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        
        <form action="login" method="POST">
               Username: <input type="text" name="username"><br>
               
               Password <input type="text" name="password"><br>
               
                <input type="submit" value="Submit">            
        </form>
        
        <P>${message}</P>
    </body>
</html>
