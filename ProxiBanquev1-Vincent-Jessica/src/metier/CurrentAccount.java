package metier;


/**
 *classe qui gère les comptes courants
 */
public class CurrentAccount extends Account {
	
	public String numberAccount;
	public Double balance;
	public String creationDate;
	
	/**
	 * constructeur par défaut
	 */
	public CurrentAccount() {
		
	} 
	
	/**constructeur d'initialisation
	 * @param numberAccount
	 * @param balance
	 * @param creationDate
	 */
	public CurrentAccount(String numberAccount, double balance,String creationDate) {
		this.numberAccount = numberAccount;
		this.balance = balance;
		this.creationDate = creationDate;
	}
}
  