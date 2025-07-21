<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <jsp:include page="Nav.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FOOD DELETE FORM</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div style="width:30%;margin:50px auto;">
<h2 class="text-white bg-dark">FOOD FORM</h2>
<form action="FoodDelServe" method="post">
<input type="text" class="form-control" name="fid" placeholder="ENTER THE FOOD ID"/>
<input type="submit" class="btn btn-outline-danger" value="DELETE"/>
</form>
</div>
</body>
</html>