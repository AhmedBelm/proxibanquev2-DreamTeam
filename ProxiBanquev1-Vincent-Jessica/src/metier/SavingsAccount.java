package metier;


/**Classe gérant les comptes d'Epargne 
 * @author Adminl *
 */
public class SavingsAccount extends Account {
	
public String numberAccount;
public Double balance;
public String creationDate;
	

	/**
	 * Constructeur par défaut
	 */
	public SavingsAccount() {
		
	}
	
	/**Constructeur d'initialisation
	 * @param numberAccount
	 * @param balance
	 * @param creationDate
	 */
	public SavingsAccount(String numberAccount, Double balance, String creationDate) {
		this.numberAccount = numberAccount;
		this.balance = balance;
		this.creationDate = creationDate;
		}
}