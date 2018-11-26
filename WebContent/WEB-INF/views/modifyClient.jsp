<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Proxibanque SI version 2.0</title>
</head>
<body>
	<div> 
		<div>
			<h1>Liste des clients : </h1>
		</div>
		<div>
		
		//Table
		
		</div>
	</div>
	<div>
		<div>
			<h2>Veuillez choisir un client et une action à effectuer : </h2>
		</div>
		<div>
			//Liste client ou demande client 
		</div>
		<div>
			<a href="modify.html" target="_parent"><button>Modifier dossier</button></a>
			<a href="account.html" target="_parent"><button>Modifier dossier</button></a>
			<a href="transfer.html" target="_parent"><button>Modifier dossier</button></a>
		</div>
	</div>
	
	
	<div> 
		<c:forEach var="article" items="${articles}">
			<div class="article">
				<h2>
					${article.title}
					<a href="delete.html?id=${article.id}">X</a>
				</h2>
				<p>${article.content}</p>
			</div>
		</c:forEach>
	</div>
</body>
</html>