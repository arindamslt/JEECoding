<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Form</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div style="width:30%;margin:50px auto;">
<form action="Show.jsp" method="post">
<input type="text" name="cid" class="form-control" placeholder="ENTER THE CUSTOMER ID"/>
<input type="text" name="cname" class="form-control" placeholder="ENTER THE CUSTOMER NAME"/>
<input type="text" name="cphno" class="form-control" placeholder="ENTER THE CUSTOMER PHONE NO"/>
<input type="submit" class="btn btn-outline-success" value="REGISTER">
</form>
</div>
</body>
</html>