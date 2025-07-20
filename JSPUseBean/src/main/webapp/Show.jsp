<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <jsp:useBean id="cs" class="com.arindam.bean.Customer">
   <jsp:setProperty name="cs" property="cid"/>
    <jsp:setProperty name="cs" property="cname"/>
     <jsp:setProperty name="cs" property="cphno"/>
   </jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>CID:<%=cs.getCid()%></h2>
<h2>NAME:<%=cs.getCname() %></h2>
<h2>PHONE NO:<%=cs.getCphno() %></h2>

</body>
</html>