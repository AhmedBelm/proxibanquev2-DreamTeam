package metier;

import java.util.ArrayList;

import metier.Advisor;
import metier.Customer;
import persistence.Data;
import presentation.Interaction;

/**
 * Classe qui gère les méthodes principales d'opération de l'utilisateur 
 * Elle contient la méthode start par laquelle le programme est lu
 */
public class DataManagement {

	
	public Interaction interaction;
	public Data data;
	public Advisor advisor;
	public boolean running;
	public Customer customer;
	public CurrentAccount currentAccount;
	public SavingsAccount savingsAccount;
	public Card card;

	/**
	 *Constructeur par défaut.
	 */
	public DataManagement() {
		this.interaction = new Interaction();
		this.data = new Data();
		this.data.loadTestData();
		this.advisor = data.agencies.get(0).advisors.get(0);

		this.running = true;
		this.customer = new Customer();
		this.currentAccount = new CurrentAccount();
		this.savingsAccount = new SavingsAccount();
		this.card = new Card();
		}

	/**
	 *Cette méthode démarre le programme 
	 *Elle ouvre le menu princiapl de l'application*/
	public void start() {
		this.advisor.sayHello(data.agencies.get(0).id);
		while (this.running) {
			this.interaction.mainMenu();
			this.manageMainMenu();				
			}
		} 	
	/**
	 * Cette méthode donne à l'utilisateur la possibilité 
	 * d'effectuer les opérations:
	 *- lecture des données client, 
	 *- réaliser un transfert
	 *- réaliser une simulation de crédit 
	 *- quitter le menu
	 */
	public void customerFile() {
		String userInput2 = this.interaction.readData();
		if (userInput2.equals("1")) {
			this.readCustomer();
		}
		else if (userInput2.equals("2")) {
			this.makeTransfer();
		}
		else if (userInput2.equals("3")) {
			this.creditSimulation();
		}
		else if (userInput2.equals("4")) {
			this.exitProxibanque();
		}
		else {
				this.interaction.display("Erreur : veuillez renseigner le chiffre correspondant à l'action que vous souhaitez");
			}
	}
	/**Cette méthode donne à l'utilisateur la possibilité 
	 * de choisir l'opération qu'il veut réaliser sur le dossier 
	 * d'un client*/
	public void manageCustomer() {
		String userInput1 = this.interaction.readData();
		if (userInput1.equals("1")) {
			this.interaction.display("Pour le client " + this.customer.lastname + " " + this.customer.firstname + " : ");
			this.interaction.customerFileMenu();
			this.customerFile();
		}
		else if (userInput1.equals("2")) {
			this.modifyCustomer();
		}
		else if (userInput1.equals("3")) {
			this.deleteCustomer();
		}
		else if (userInput1.equals("4")) {
			this.selectCustomer();
		}
		else if (userInput1.equals("5")) {
			this.exitProxibanque();
		}
		else {
				this.interaction.display("Erreur : veuillez renseigner le chiffre correspondant à l'action que vous souhaitez");
			}
	}	
	/**Cette méthode donne à l'utilisateur le choix entre
	 * créer un client
	 * selectionner un client
	 * quitter l'application
	 */
	
	public void manageMainMenu() {
		String userInput = this.interaction.readData();	
		if (userInput.equals("1")) {
			this.createCustomer();
		}
		else if (userInput.equals("2")) {
			this.selectCustomer();
		}
		else if (userInput.equals("3")) {
			this.exitProxibanque();
		}
		else {
				this.interaction.display("Erreur : veuillez renseigner le chiffre correspondant à l'action que vous souhaitez");
	}
	}	
	/**
	 * Cette méthode quitte l'application
	 */
	private void exitProxibanque() {
		this.running = false;
	}
	
	/**
	 * Cette méthode créee un dossier nouveau client en entrant toutes ses données et s'il a un compte
	 * Epargne, le conseiller peut le rentrer.
	 */
	public void createCustomer() {
		this.interaction.display("Saisir le nom du client");
		this.customer.lastname= this.interaction.readData();
		this.interaction.display("Saisir le prénom du client");
		this.customer.firstname = this.interaction.readData();
		this.interaction.display("Saisir l'adresse du client");
		this.customer.adress = this.interaction.readData();
		this.interaction.display("Saisir le code postal du client");
		this.customer.postalCode = Integer.parseInt(this.interaction.readData());
		this.interaction.display("Saisir la ville du client");
		this.customer.city = this.interaction.readData();
		this.interaction.display("Saisir le téléphone du client");
		this.customer.tel = this.interaction.readData();
		this.interaction.display("Saisir le numéro de compte courant du client");
		this.customer.currentAccount.numberAccount = this.interaction.readData();
		this.interaction.display("Le client a t-il un compte d'épargne"); 
			if(this.interaction.readData().equals("oui")) {
				this.interaction.display("Saisir le numéro de compte épargne du client");
				this.customer.savingsAccount.numberAccount = this.interaction.readData();
				} 
		this.interaction.display("Saisir le type de carte du client");
		this.customer.card.type = this.interaction.readData();
		this.advisor.customers.add(customer);
		System.out.println("Voici les données du nouveaut client : \n\t" + this.customer);  
	} 
	
	/**
	 * Cette méthode modifie le dossier d'un client
	 */
	public void modifyCustomer () {
		this.interaction.display("\nPour le client " + this.customer.lastname + " " + this.customer.firstname + " : ");
        this.interaction.modifyCustomerMenu();
        String userInput = " ";
        while (!userInput.equals("Exit")) {
        	this.interaction.display("Quelle action souhaitez-vous réaliser? ");
        	userInput = this.interaction.readData();
            if (userInput.equals("1")) {
                this.interaction.display("Veuillez renseigner le nouveau nom : ");
                this.customer.lastname=interaction.readData();
            }
            else if (userInput.equals("2")) {
                this.interaction.display("Veuillez renseigner le nouveau prénom : ");
                this.customer.firstname=interaction.readData();
            }
            else if (userInput.equals("3")) {
                this.interaction.display("Veuillez renseigner la nouvelle adresse : ");
                this.customer.adress=interaction.readData();
            }
            else if (userInput.equals("4")) {
                this.interaction.display("Veuillez renseigner le nouveau code postal : ");
                this.customer.postalCode=Integer.parseInt(interaction.readData());
            }
            else if (userInput.equals("5")) {
                this.interaction.display("Veuillez renseigner le nouveau pays : ");
                this.customer.city=interaction.readData();
            }
            else if (userInput.equals("6")) {
                this.interaction.display("Veuillez renseigner le nouveau numéro de téléphone : ");
                this.customer.tel=interaction.readData();
            }
            else {
                this.interaction.display("Erreur : veuillez renseigner le chiffre correspondant à l'action que vous souhaitez.");
            }
        }
        if (userInput.equals("7")) {
                this.exitProxibanque();
        }
        
        this.interaction.display("Voici les nouvelles données : ");
        this.interaction.display(this.customer.lastname + " " + this.customer.firstname + " " + this.customer.adress + " "
                                    + this.customer.postalCode + " " + this.customer.city + " " + this.customer.tel);
	}	
	/**
	 * Cette méthode affiche les données d'un client
	 */
	public void readCustomer() {
		this.interaction.display("\nVoici le dossier de votre client : ");
		this.interaction.display("\n\t Pr�nom : " + this.customer.firstname + "\n\t Nom : " +this.customer.lastname + "\n\t Adresse : " +  this.customer.adress 
					+ "\n\t Code Postal : " + this.customer.postalCode 
					+ "\n\t Ville : " + this.customer.city 
					+ "\n\t T�l�phone : " + this.customer.tel );
	}  
	/**
	 * Cette méthode permet de supprimer un dossier client
	 */
	public void deleteCustomer() {
		
		for (int i=0; i < this.advisor.customers.size(); i++) {
			if (this.advisor.customers.size() == 0) {
				this.interaction.display("Impossible de supprimer un client car la liste est vide. \n  Retour au menu principal");
				this.manageMainMenu();	
			}
			else if (this.advisor.customers.get(i).lastname.equals(this.customer.lastname) && this.advisor.customers.get(i).firstname.equals(this.customer.firstname)) {
				this.advisor.customers.remove(i);
				this.interaction.display("Le client " + this.customer.firstname + " " 
						+ this.customer.lastname + " a bien �t� supprim�.\r\n");
			}
		}
	}
	/**
	 * Méthode appelée par la méthode "makeTransfert" pour réaliser le virement de fonds.
	 */
	public void transfer(Account a, Account b, int amount) {
		a.balance -= amount;
		b.balance += amount;
	}
	
	/**
	 * Méthode pour réaliser un transfert dans le dossier d'un client qui possède deux comptes (client 1 et 5)
	 * Elle demande les données nécessaires pour le transfert puis en fonction des fonds disponibles,
	 * elle fait appelle à la méthode "transfert"
	 */
	public void makeTransfer() {
		if (this.customer.currentAccount.numberAccount != null && this.customer.savingsAccount.numberAccount != null) {
			
			String userInput = this.interaction.readData();
			
			if (userInput.equals("current")) {
				this.interaction.display(message);
				String userInputAmount = this.interaction.readData();
				int transferAmount = Integer.parseInt(userInputAmount); 
				double currentBalance = this.customer.currentAccount.balance;
				double balanceAfterTransfer = currentBalance - transferAmount;
				if (balanceAfterTransfer > Constants.OVERDRAFT_CURRENT) {
					this.transfer(this.customer.currentAccount, this.customer.savingsAccount, transferAmount);
				}
				else {
					while (balanceAfterTransfer > Constants.OVERDRAFT_CURRENT) {
						//Afficher que virement n'est pas possible : manque de fonds
					}
				}
			}
			if (userInput.equals("savings")) {
				String userInputAmount = this.interaction.readData();
				int transferAmount = Integer.parseInt(userInputAmount); 
				double savingsBalance = this.customer.savingsAccount.balance;
				double balanceAfterTransfer = currentBalance - transferAmount;
				if (balanceAfterTransfer > Constants.OVERDRAFT_CURRENT) {
					this.transfer(this.customer.savingsAccount, this.customer.currentAccount, transferAmount);
				}
				else {
					while (balanceAfterTransfer > Constants.OVERDRAFT_CURRENT) {
						//Afficher que virement n'est pas possible : manque de fonds
					}
				}
			}
		
			}
		}
		else {
			//Aficher que le client n'a qu'un compte donc virement impossible
	}

	/**
	 * Cette méthode permet d'effectuer une simulation de crédit.
	 */
	public void creditSimulation() {
		this.interaction.display("Quelle simulation de crédit souhaitez-vous faire : \n\t 1. Crédit de consommation. \n\t 2. Crédit immobilier."
								+ "\n\t 3. Exit vers menu principal.");
		String userInput = this.interaction.readData();
		if (userInput.equals("1")) {
			
		this.interaction.display("Le client " + this.customer.lastname + " " + this.customer.firstname +
									" peut obtenir un crédit consommation de " + 4*this.customer.savingsAccount.balance + "euros a un taux de "
									+ Constants.RATE_CONSO +"%.");
		}
		else if (userInput.equals("2")) {
			this.interaction.display("Le client " + this.customer.lastname + " " + this.customer.firstname +
					" peut obtenir un crédit immobilier de " + 70*this.customer.savingsAccount.balance + "euros a un taux de "
					+ Constants.RATE_IMMO +"%.");
		}
		else {
			this.manageMainMenu();
		} 
	}
	
	/** Méthode qui sélectionne un client
	 */
	public void selectCustomer() {
		this.interaction.display("Veuillez choisir un client : \n");
		Integer currentNumber = 0;
		for (Customer customer : advisor.customers) {
			this.interaction.display(currentNumber + " - " + customer.firstname + " " + customer.lastname);
			currentNumber++;
		}
		String userInput = this.interaction.readData();
		this.customer = advisor.customers.get(Integer.parseInt(userInput));
		
		this.interaction.manageCustomerMenu();
		this.interaction.display("Pour le client " + this.customer.lastname + " " + this.customer.firstname + " : ");
		this.manageCustomer();
	}
}