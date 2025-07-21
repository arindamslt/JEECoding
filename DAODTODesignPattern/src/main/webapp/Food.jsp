<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:include page="Nav.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FOOD FORM</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div style="width:30%;margin:50px auto;">
<h2 class="text-white bg-dark">FOOD FORM</h2>
<form action="FoodAddServe" method="post">
<input type="text" class="form-control" name="fid" placeholder="ENTER THE FOOD ID"/>
<input type="text" class="form-control" name="fname" placeholder="ENTER THE FOOD NAME"/>
<input type="text" class="form-control" name="price" placeholder="ENTER THE FOOD PRICE"/>
<input type="submit" class="btn btn-outline-primary" value="ADD"/>
</form>
</div>
</body>
</html>