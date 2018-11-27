Procédure d'installation : 

A. Tout d'abord, veuillez vérifier que la machine virtuelle Java est installée sur le système.
	-> Si ce n'est pas le cas, vous pouvez télécharger Java à l'adresse suivante : https://www.java.com/fr/download/

B. Procédez à l'extraction et l'ouverture des ressources du livrable.
		- Grâce à un clic droit sur le fichier.zip, sélectionnez "Extraire ici".
		- Ouvrez le fichier script.bat grâce à la machine virtuelle Java ou l'invite de commande.

C. Pour tester l'application, il vous suffit de suivre les explications suivantes:

	0. Situation de départ : vous êtes le conseiller Lila Durand de l'Agence 01254.
	1. Le menu principal de ProxibanqueSI s'affiche, vous avez 3 choix :
			- 1 = Créer un client 
			- 2 = Gérer vos clients,
			- 3 = Exit.
		Vous devez répondre en renseignant le numéro de votre choix : 1, 2 ou 3.
		Le premier choix permet de créer un nouveau client, d'afficher ses nouvelles informations et de revenir au menu principal.
		Le deuxième choix est expliqué au point 2..
		Le troisième choix permet de sortir du programme. Vous retrouverez cette option de nombreuses fois dans le programme.
	2. Vous avez choisi l'option "Gérer vos clients".
		La liste de vos clients s'affiche comme suit : 
			0 - Client1
			1 - Client2
			2 - Client3
			...
		Vous devez sélectionner un client en écrivant son nombre associé : 0 pour le client 1 etc.
		Une fois ce choix réaliser, un second menu s'affiche. 
	3.Un second menu s'affiche, vous avez 5 choix : 
			- 1 = Accéder au dossier du client,
			- 2 = Modifier les informations du clients, 
			- 3 = Supprimer le dossier du client, 
			- 4 = Changer de client, 
			- 5 = Exit.
			Vous devez répondre en renseignant le numéro de votre choix : 1, 2, 3, 4 ou 5.
		Le premier choix est expliqué au point 4..
		Le deuxième choix permet de modifier les informations du client sélectionné, de les affciher puis de revenir au menu principal. 
		Le troisième choix permet de supprimer le dossier d'un client ainsi que ses comptes et carte associés, puis de revenir au menu principal.
		Le quatrième choix permet de sélectionner un nouveau client puis de revenir au menu principal.
		Le cinquième choix permet de quitter l'application.  
	4. Vous avez choisi l'option "Accéder au dossier du client".
		Un troisième menu s'affiche, vous avez 4 choix : 
			- 1 = Lire le dossier du client, 
			- 2 = Faire un virement, 
			- 3 = Faire une simulation de crédit, 
			- 4 = Exit.
			Vous devez répondre en renseignant le numéro de votre choix : 1, 2, 3 ou 4.
		Le premier choix permet d'afficher les informations contenues dans le dossier du client, tels que son nom,son prénomn, son numéro de téléphone etc.
		Le deuxième choix permet de réaliser un virement d'un compte du client vers son autre compte, ce qui implique que le client a deux compte (courant et épargne).
		Le troisième choix permet d'afficher une simulation de crédit de consommation et immobilier, c'est-à-dire un montant basé sur le solde du compte d'épargne avec le taux fixe correspondant.
		Le quatrième choix permet de sortir du programme.

D. Prenons le cas d'utilisation "Ajouter un nouveau client". Il vous suffit :
		- De lancer le programme,
		- De renseigner "1" à la suite du menu principal, pour "Créer un client",
		- De renseigner les différents champs demandés
	Le programme vous affiche les informations du nouveau client et vous raffiche le menu principal. 

E. Prenons le cas d'utilisation "Faire un virement de compte à compte pour un client". Il vous suffit : 
	- De lancer le programme, 
	- De renseigner "2" à la suite du menu principal, pour "Gérer un dossier client",
	- De choisir un client parmi la liste proposée en renseignant le numéro précédent le nom du client,
	- De renseigner "1" à la suite du second menu, pour "Acceder au dossier du client",
	- De renseigner "2" à la suite du troisième menu, pour accéder à "Faire un virement", 
	- De renseigner les informations "Compte débiteur" et "Montant" du viremnt.

	Si le client a les provisions, le programme affiche le résumé du virement, sinon il affiche un message d'erreur précisant que les fonds sont insuffisants pour le montant demandé. Vous devez alors choisir un montant plus faible jusqu'à acceptation du virement. Si vous souhaitez sortir du programme et retourner au menu principal, il vous suffit de renseigner 0 pour le montant du virement. 

F. Les cas d'erreur et d'exception de l'application sont gérés grâce à une boucle try-catch située dans la fonction principale main, de la classe Proxibanc. Ainsi, si une erreur ou une exception se produit à l'intérieur de cette fonction, elle est gérée par le catch. Cela permet à l'utilisateur de revenir au menu principal et de continuer à utiliser les autres fonctionnalités du programme.

						--------------------------------------------------------------------------------------
						
N.B. : Si vous avez besoin de télécharger à nouveau le programme, l'adresse du repository sur GitHub pour le code source est :
		https://github.com/jessicaDIM/proxiBanqueV1.git