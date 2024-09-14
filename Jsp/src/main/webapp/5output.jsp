<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.time.LocalDate" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Output page</title>
</head>
<body>
		<h1>
        <%= "Hello " + request.getParameter("Name") %>
        Your next Date of birth is:
        <% 
        
        LocalDate dob = LocalDate.parse(request.getParameter("LocalDate"));
        
        
        LocalDate nextDob=dob.withYear(LocalDate.now().getYear());
        
        if(nextDob.isBefore(LocalDate.now())){
        	nextDob=nextDob.plusYears(1);
        }
        
        out.print(nextDob);
       
        
        %>
    </h1>
</body>
</html>