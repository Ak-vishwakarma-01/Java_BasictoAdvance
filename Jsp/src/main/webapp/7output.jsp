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
          String name = request.getParameter("username");
          String pass = request.getParameter("password");
          
          try{
        	  Class.forName("com.mysql.cj.jdbc.Driver");
        	  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdbms", "root","12345678@");
              Statement stmt = con.createStatement();
        	  stmt.executeUpdate("insert INTO login VALUES ('" + name + "', '" + pass + "')");
        	  out.print("you havae successfully added the name and pass");
        	  
          }catch(Exception ae){
        	  String exc = ae.toString();
        	  out.print(exc);
          }
       %>
       <form name="ChangePass" action="8changepasss.jsp">
       <h3>Enter the new pass to change</h3>
       <input type="password" name="newpass">
       <h3>Enter the username to change</h3>
       <input type="text" name="username" value=>
       <button type="submit"> submit </button>
       </form>
</body>
</html>