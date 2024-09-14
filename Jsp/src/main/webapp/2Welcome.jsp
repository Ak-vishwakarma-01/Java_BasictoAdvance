<%-- 
    Document   : Welcome
    Created on : 16 Mar, 2022, 9:50:25 AM
    Author     : RV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <h1>
             <%= "Hello " + request.getParameter("User Name")%>
        </h1>>
        <% session.setAttribute("id", request.getParameter("Registration")); %>
        
        <%= "Click here to make Payment" %>
        <a href='3Payment.jsp'>Payment</a>
    </body>
</html>
