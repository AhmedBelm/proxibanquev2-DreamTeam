package metier;

/**Super classe d'un compte bancaire
 * @author Adminl
 *attributs: numero de compte, provision et date d'ouverture.
 */
public abstract class Account {

	public String numberAccount;
	public double balance;
	public String openningDate;

	/**
	 * constructeur par défaut
	 */
	public Account() {
		
	}
	
	@Override
	public String toString() {
		return ("Compte #" + this.numberAccount + "");
	}
} 