<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP TEST</title>
</head>
<body>
<%!
public int add(int a,int b)
{
	return(a+b);
}
%>
<%
  int x=10;
  int y=25;
%>
RESULT:<%=x+y %>
<p>
<% out.println(x+y); %>
<%=add(5,6) %>
</body>
</html>