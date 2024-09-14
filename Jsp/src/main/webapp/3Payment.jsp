<%-- 
    Document   : Payment
    Created on : 16 Mar, 2022, 9:55:35 AM
    Author     : RV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Payment Successful!</h1>
        <%   String reg = (String)session.getAttribute("id");
            if(reg != null)
            out.print("Payment received from "+ reg); 
            session.invalidate();
            %>
    </body>
</html>
