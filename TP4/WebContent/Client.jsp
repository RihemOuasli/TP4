<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="client" class="Modeles.ClientBean" scope="session"/>
<h1>Informations du client</h1>
  <p>Nom: ${client.nom}</p>
  <p>Prénom: ${client.prenom}</p>
  <p>Adresse de livraison: ${client.adresse}</p>
  <p>Numéro de téléphone: ${client.tel}</p>
  <p>Adresse e-mail: ${client.email}</p>
</body>
</html>