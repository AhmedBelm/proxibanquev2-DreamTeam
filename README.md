Le lien vers le projet GitHub est :
	https://github.com/AhmedBelm/proxibanquev2-DreamTeam.git
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	Procédure d'installation
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
A. Tout d'abord, veuillez vérifier que la machine virtuelle Java est installée sur le système.
	-> Si ce n'est pas le cas, vous pouvez télécharger Java à l'adresse suivante : https://www.java.com/fr/download/
	
B. Veuillez vérifier que le serveur web Apache TomCat est installé sur votre système.
		-> Si ce n'est pas le cas, vous pouvez télécharger la version 8.5 de TomCat à l'adresse suivante : https://tomcat.apache.org/download-80.cgi
		
C. Veuillez vérifier qu'Système de Gestion de Base de Données (SGBD) est installé sur votre système.
		--> Si ce n'est pas le cas, vous pouvez télécharger MySQL Community Server 8.0.13 (Oracle) à l'adresse suivante : https://dev.mysql.com/downloads/mysql/
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	Procédure d'exécution
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Procédez à l'extraction et l'ouverture des ressources du livrable.
		0. Configurer le réseau au port localhost 3306 et importer les fichiers dump-structure.sql et dump-data.sql. Le schéma correspondant au projet porte le nom : proxibanquev2.
		1. Démarrer le serveur d'application Tomcat en cliquant sur le fichier "bin\startup.bat".
		2. Glisser le livrable (fichier avec extension *.war) dans le répertoire Webapps du dossier d'installation de Tomcat.
		3. Une fois l'application déployée, un dossier au nom du fichier war est visible dans le répertoire Webapps.
		4. Démarrer le navigateur, rentrer l'adresse suivante <http://localhost:8080/proxibanquev2-DreamTeam/>
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	Test applicatif
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Pour tester l'application, il vous suffit de suivre les explications suivantes:
	----------------------------------
	0. Situation de départ : vous êtes un conseiller de la banque Proxibanque et vous naviguez sur leur Système d'Information.
	----------------------------------
	1. Le menu principal de ProxibanqueSI s'affiche. Vous y trouvez une liste de vos clients avec les informations suivantes: N°Client, Nom, Prénom, Email et Adresse. 
		En dessous, vous trouvez 2 fenêtres déroulantes: l'une vous demandant de choisir un client de la liste, l'autre vous demande de choisir entre diverses actions.
		Après avoir sélectionner un client, vous pouvez choisir entre les 3 actions suivantes: Modifier le dossier, Accéder aux comptes, Effectuer un virement.
		
		Cliquez ensuite sur valider.
		
		Si vous avez choisi l'action : "Modifier le dossier", veuillez continuer de lire à partir du 2..
		Si vous avez choisi l'action : "Accéder aux comptes", veuillez continuer de lire à partir du 3..
		Si vous avez choisi l'action : "Effectuer un virement", veuillez continuer de lire à partir du 4..
	----------------------------------	
	2. Vous avez choisi l'action : "Modifier le dossier" dans le Menu principal.
	
		Vous êtes redirigé vers une nouvelle page dans laquelle vous trouvez un récapitulatif des informations du client (N°Client, Nom, Prénom, Email, Adresse) ainsi qu'un formulaire pour modifier ces informations.
		Pour modifier les informations du client, il vous suffit de remplir les champs à modifier parmi le nom, le prénom, l'e-mail et adresse.
		Si vous ne souhaitez pas modifier tous les champs, laissez ces champs tels qu'ils sont. 
		
		Cliquer ensuite sur Valider pour effectuer les modifications. 

		Si vous souhaitez sortir de la page, cliquez sur Valider sans remplir de champs. 
	
		Vous êtes alors redirigé vers le Menu principal.
	----------------------------------	
	3. Vous avez choisi l'action : "Accéder aux comptes" dans le Menu Principal.
	
		Vous êtes redirigé vers une nouvelle page dans laquelle vous trouvez un récapitulatif des informations bancaires du client : ID, N° du compte, Solde et le type de compte (colonne "Compte Epargne?").
		Dans la colonne "Compte Epargne?", vous trouverez les informations "TRUE" ou "FALSE":
			- "TRUE" indique que le compte de cette ligne est un compte d'Epargne.
			- "FALSE" indique que le compte de cette ligne est un compte Courant.
		
		Si vous souhaitez sortir de la page, cliquez sur Menu principal. 
	
		Vous êtes alors redirigé vers le Menu principal.
	----------------------------------	
	4. Vous avez choisi l'action : "Effectuer un virement" dans le Menu Principal.
		
		Vous êtes redirigé vers une nouvelle page dans laquelle vous trouvez 2 fenêtres déroulantes et 1 champs à remplir.
		
		La première fênetre vous permet de choisir, parmi les comptes du client sélectionné dans le menu principal, le compte émetteur pour le virement.
		La deuxième fênetre vous permet de choisir, parmi les comptes du client sélectionné dans le menu principal, le compte bénéficiaire du virement.
		Le champ à remplir est le montant, en euros, à virer du compte émetteur au compte bénéficiaire. 
		
		Cliquer ensuite sur Valider pour effectuer le virement. 
		Si le client a bien deux comptes au minimum et que le virement ne provoque pas de découvert sur le compte émetteur, le virement est réaliser. 
		
<<<<<<< HEAD
		Vous êtes alors redirigé vers le Menu principal.
=======
		Vous êtes alors redirigé vers le Menu principal.
>>>>>>> 2685a7901b47392d40501188d7a7889895591e12
