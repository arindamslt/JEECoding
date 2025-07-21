<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REGISTER FORM</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div style="width:30%;margin:50px auto;">
<h2 class="text-white bg-dark">SIGN UP FORM</h2>
<form action="LoginServe" method="post">
<input type="text" class="form-control" name="uname" placeholder="ENTER THE USERNAME"/>
<input type="text" class="form-control" name="pass" placeholder="ENTER THE PASSWORD"/>
<input type="submit" class="btn btn-outline-success" value="LOGIN"/>
</form>
</div>
</body>
</html>