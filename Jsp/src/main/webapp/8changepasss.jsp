<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
        <%
           String newpass = request.getParameter("newpass");
           try{
        	   Class.forName("com.mysql.cj.jdbc.Driver");
        	   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdbms","root","12345678@");
        	   String name = request.getParameter("username");
        	   PreparedStatement stmt = con.prepareStatement("update login set password='"+newpass+"' where username='"+name+"'");
        	   out.print(name);
        	  int num =  stmt.executeUpdate();
        	   if(num>0)out.print("Password changed successfully");
        	   else out.print("Error A gya bhaiyaa");
           }catch(Exception ae){
        	   out.print(ae.toString());
           }
        %>
</body>
</html>