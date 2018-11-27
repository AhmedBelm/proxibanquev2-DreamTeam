package metier;


/**
 *Classe gérant les clients
 */
public class Customer {

	public String lastname;
	public String firstname;
	public String adress;
	public int postalCode;
	public String city;
	public String tel;
	public CurrentAccount currentAccount;
	public SavingsAccount savingsAccount;
	public Card card;
	 
		
			/**
			 * Constructeur par défaut
			 */
			public Customer () {
				currentAccount = new CurrentAccount();
				savingsAccount = new SavingsAccount();
				card = new Card();
			}
			
			/**Constructeur d'initialisation prenant 
			 * lastname, firstname et adress du client en paramètres.
			 *
			 * @param lastname
			 * @param firstname
			 * @param adress
			 * @param postalCode
			 * @param city
			 * @param tel
			 * @param currentAccount
			 * @param savingsAccount
			 * @param card
			 */
			public Customer(String firstname, String lastname, String adress,
					int postalCode, String city, String tel, CurrentAccount currentAccount, SavingsAccount savingsAccount, Card card) {
			this.lastname = lastname;
			this.firstname = firstname;
			this.adress = adress;
			this.postalCode = postalCode;
			this.city = city;
			this.tel= tel;
			
			this.currentAccount = currentAccount;
			this.savingsAccount = savingsAccount;
			this.card = card;

		}
			@Override
			public String toString() {
				return ("\n" + this.firstname + "\n" 
						+ this.lastname + "\n"
						+ this.adress 
						+ "\n" + this.postalCode + "\n" 
						+ this.city + "\n"
						+ this.tel + "\n"
						+ this.currentAccount.numberAccount + "\n" 
						+ this.savingsAccount.numberAccount 
						+ "\n" + this.card.type);	
				}		

		} 