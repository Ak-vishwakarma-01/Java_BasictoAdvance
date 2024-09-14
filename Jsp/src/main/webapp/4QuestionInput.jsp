<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Input page</title>
</head>
<body>
      <h2>WAP to implement a JSP page which reads the Dob of the user and prints the name and upcoming in thenext page
          along with a hello _______ message when show button is pressed. </h2>
          
      <form name="DOB" action="5output.jsp">
        <h4>Enter your name</h4>
        <input type="text" name="Name" value="">
        <h4>Enter your dob in ISO form</h4>
        <input type="date" name="LocalDate" value="">
        <button type="submit">Submit</button>
    </form>

</body>
</html>