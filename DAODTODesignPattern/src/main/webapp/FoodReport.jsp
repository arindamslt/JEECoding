<%@page import="master.dao.FoodDao"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="Nav.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FOOD REPORT</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<h2 style="text-align:center;">FOOD REPORT</h2>
<div style="width:30%;margin:50px auto;">
<table class="table table-hover table-striped table-bordered">
<thead class="table table-dark">
<tr>
<th>FOODID</th>
<th>FOOD NAME</th>
<th>PRICE</th>
</tr>
</thead>
<tbody>
<%
FoodDao fdao=new FoodDao();
 ResultSet rs=fdao.getData();
 while(rs.next())
 {
%>
<tr>
<td><%=rs.getString(1) %></td>
<td><%=rs.getString(2) %></td>
<td><%=rs.getString(3) %></td>
<%
 }
%>
</tbody>
</table>
</div>
</body>
</html>