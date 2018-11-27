<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isErrorPage="true"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Proxibanque SI</title>

    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>

    <!-- Custom styles for this template -->
    <link href="css/agency.min.css" rel="stylesheet">

  </head>

  <body id="page-top">

  <section class="bg-light" id="portfolio">
      <div class="container">
        <div class="row">
          <div class="col-lg-12 text-center">
            <h2 class="section-heading text-uppercase" style="color: red">Erreur</h2>
          </div>
        </div>
        <div style="margin-top: 30px; background-color: red; color: white;  border-width:2px; border-style:double; border-color:black; width: 30%; margin-left:35%" >
        	<p>Une erreur s'est produite dans le programme, merci de contacter le responsable technique de l'application.</p>
       	</div>
       	<div style="Margin-left: 43%; margin-top: 100px">
       		
	       		<c:url var="indexUrl" value="/"/>
				  <a href="${indexUrl}"> 
				    <button type="submit" class="btn btn-primary">Menu principal</button> 
				  </a>
       	</div>
       	</div>
    </section>

  </body>

</html>