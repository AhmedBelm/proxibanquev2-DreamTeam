<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Proxibanque SI</title>

<!-- Bootstrap core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom fonts for this template -->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet" type="text/css">
<link href='https://fonts.googleapis.com/css?family=Kaushan+Script'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700'
	rel='stylesheet' type='text/css'>

<!-- Custom styles for this template -->
<link href="css/agency.min.css" rel="stylesheet">

</head>

<body id="page-top">

	<section class="bg-light" id="portfolio">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 text-center">
					<h2 class="section-heading text-uppercase">Faire un virement</h2>
				</div>
			</div>
			<div style="margin-top: 30px">
				<h3 style="margin-left: 40%">Selection</h3>
				<div class="dropdown">
					<form method="post" action="">
						<div style="margin-left: 40%">
							<label for="accounts">Compte émetteur</label> <select
								id="accounts" name="numberA">
								<option label="---" value="" />
								<c:forEach items="${accounts}" var="account">
									<option label="${account.number} | ${account.balance}"
										value="${account.number}" />
								</c:forEach>
							</select>
						</div>
						<div style="margin-left: 40%">
							<label for="account">Compte bénéficiaire</label> <select
								id="accounts" name="numberB">
								<option label="---" value="" />
								<c:forEach items="${accounts}" var="account">
									<option label="${account.number} | ${account.balance}"
										value="${account.number}" />
								</c:forEach>
							</select>
						</div>
						<div class="form-row">
							<div class="form-group col-md-6" style="margin-left: 25%">
							
								<label for="amount">Montant du transfert</label> <input
									type="text" class="form-control" id="amount" name="amount"
									value="${account.amount}"/>
							</div>
							<button type="submit" class="btn btn-primary"
								style="margin-left: 45%">Valider</button>
						</div>
					</form>

				</div>
				</div>
			</div>
	</section>

</body>

</html>