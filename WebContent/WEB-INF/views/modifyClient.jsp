<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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
            <h2 class="section-heading text-uppercase">Modifier le dossier client</h2>
          </div>
        </div>
        <div style="margin-top: 30px">
        	<h3> Informations client : </h3>
        	<table class="table table-hover">
				<thead>
				    <tr>
				      <th class="listeclient">N° Client</th>
				      <th class="listeclient">Nom</th>
				      <th class="listeclient">Prénom</th>
				      <th class="listeclient">Email</th>
				      <th class="listeclient">Adresse</th>
				    </tr>
				 </thead>
				 <tbody>
				   		<tr>
				     		<td class="listeclient">${client.id}</td>
				      		<td class="listeclient">${client.lastname}</td>
				      		<td class="listeclient">${client.firstname}</td>
				      		<td class="listeclient">${client.email}</td>
				      		<td class="listeclient">${client.address}</td>
				   	 	</tr>
				 </tbody>
			</table>
       	<div>
       	  <form method="post">
			  <div class="form-row">
<!-- 			   <div class="form-group col-md-6"> -->
<!-- 			      <label for="firstname">N° Client</label> -->
<%-- 			      <input type="text" class="form-control" id="firstname"  name="firstname" value="${client.id}" style="pointer-events:none;"> --%>
<!-- 			    </div> -->
			    <div class="form-group col-md-6">
			      <label for="lastname">Nom</label>
			      <input type="text" class="form-control" id="lastname" name="lastname" value="${client.lastname}">
			    </div>
			    <div class="form-group col-md-6">
			      <label for="firstname">Prénom</label>
			      <input type="text" class="form-control" id="firstname"  name="firstname" value="${client.firstname}">
			    </div>
				  <div class="form-group">
				    <label for="email">Email</label>
				    <input type="text" class="form-control" id="email" name="email"  value="${client.email}">
				 	 </div>
				  <div class="form-group">
				    <label for="address">Adresse</label>
				    <input type="text" class="form-control" id="address"  name="address" value="${client.address}">
				   </div>
				  </div>
				  <c:url var="indexUrl" value="/"/>
				  <a href="${indexUrl}"> 
				    <button type="submit" class="btn btn-primary" style="margin-left:50%">Valider</button> 
				  </a>
       	  </form>
       	</div>
       	</div>
       	</div>
    </section>

  </body>

</html>