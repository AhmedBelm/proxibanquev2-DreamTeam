package fr.formation.proxibanquev2.metier;

import java.util.List;

import fr.formation.proxibanquev2.persistance.AccountDao;

/**
 * La classe AccountService carrectérise les services proposés sur les objets de la classe Account.
 * @author Adminl
 *
 */

public class AccountService {

	
	
	public static final AccountService INSTANCE = new AccountService();

	/**
	 * constructeur d'initialisation de la methode getInstance
	 * @return
	 */
	
	public static AccountService getInstance() {
		return AccountService.INSTANCE;
	}

	private final AccountDao dao;

	/**
	 * constructeur par défaut
	 */
	
	public AccountService() {
		this.dao = new AccountDao();
	}
	
	/**
	 * Constructeur d'initialisation de la méthode getAll.  
	 * @return
	 */
	
	public List<Account> getAll() {
		return this.dao.readAll();
	}

	/**
	 * Constructeur d'initialisation de la méthode readAllAccountService.
	 * @param id_client
	 * @return
	 */
	
	public List<Account> readAllAccountService(Integer id_client) {
		return this.dao.readAllAccount(id_client);
	}
	
	/**
	 * Constructeur d'initialisation de la méthode readAccount.
	 * @param number
	 * @return
	 */
	
		public Account readAccount(Integer number) {	
		return this.dao.read(number);
	}	
		
	/**
	 * Constructeur d'initialisation de la méthode readAllAccountTransfer
	 */
	
	public List<Account> readAllAccountTransfer(Integer id) {
		return this.dao.readAllAccount(id);
	}
	
	/**
	 * Constructeur d'initilisation qui ne retourne rien et qui prend numberA, numberB, amount en paramètre.
	 * @param numberA
	 * @param numberB
	 * @param amount
	 */

	public void transfer(Integer numberA, Integer numberB, Float amount) {


		if (numberA != null && numberB != null) {
			Account a = this.dao.readByNumber(numberA);
			Account b = this.dao.readByNumber(numberB);

			float currentBalanceA = a.getBalance();
			float currentBalanceB = b.getBalance();

			float balanceAfterTransfer = currentBalanceA - amount;
			if (balanceAfterTransfer > 0) {
				a.setBalance(currentBalanceA - amount);
				b.setBalance(currentBalanceB + amount);
				this.dao.update(a);
				this.dao.update(b);
			}
		}
	}
}
