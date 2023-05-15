<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<jsp:useBean id="T" class="Modeles.AuthentBean" scope="session"></jsp:useBean>
<h1>Bienvenue a votre session</h1>
<%if (request.getParameter("nom").equals("")){ %>
<jsp:useBean id="authentBean" type="Modeles.AuthentBean" scope="session"/>
<h2>Prenom: <jsp:getProperty name="authentBean" property="prenom"/></h2>
<h2>Nom<jsp:getProperty name="authentBean" property="nom"/></h2>
<%}else{ %>
<h2>Prenom:<%=request.getParameter("rihem") %></h2>
<h2>Nom:<%=request.getParameter("ouasli")%></h2>
<% }%>
</body>
</html>