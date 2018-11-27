package presentation;

import java.util.Scanner;

import metier.DataManagement;

/**
 *Classe permettant l'affichage et la lecture des données
 */
public class Interaction {

	public DataManagement dataManagement;
	Scanner saisie = new Scanner (System.in);
	
	/**Constructeur de lecture d'une information
	 * @return
	 */
	public String readData() {
		String response = saisie.nextLine();
		return response;
	} 

	/**Constructeur d'affichage d'un message	 * 
	 */
	public void display(String message) {
		System.out.println(message);
	}
	
	/**
	 * Affichage du menu principal
	 */
	public void mainMenu() {
		this.display("\n******************************* BIENVENUE SUR PROXIBANQUESI ******************************* "
				+ "\n\t Quelle action souhaitez-vous réaliser? \n\t 1. Créer un client \n\t 2. Gérer un dossier client. \n\t 3. Exit. ");	
	}
	
		
	/**
	 * Affichage du menu de gestion d'un dossier client
	 */
	public void manageCustomerMenu() {
		this.display("\nQuelle action souhaitez-vous réaliser? \n\t 1. Accéder au dossier du client. \n\t 2. Modifier le dossier du client. \n\t 3. Supprimer le dossier du client."
				+ "\n\t 4. Changer de client. \n\t 5. Exit.");
	}
	
	/**
	 * Affichage du menu d'opérations pour un client
	 */
	public void customerFileMenu() {
		this.display("\nQuelle action souhaitez-vous réaliser? \n\t 1. Lire le dossier "
				+ "\n\t 2. Faire un virement.\n\t 3. Faire une simulation de crédit. \n\t 4. Exit.");
	}
	/**
	 * affichage du menu de modification d'un dossier client
	 */
	public void modifyCustomerMenu() {
		this.display("\t 1. Changer le nom. \n\t 2. Changer le prenom. \n\t 3. Changer adresse. \n\t 4. Changer le code postal."
				+ " \n\t 5. Changer le pays. \n\t 6. Changer le numéro de téléphone. \n\t 7. Exit. ");
	}
	
	
} 