<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page language="java" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h3 style="color:red;">An error occurred:</h3>
    <p>Error Message: <%=request.getAttribute("msg").toString()%></p>
</body>
</html>