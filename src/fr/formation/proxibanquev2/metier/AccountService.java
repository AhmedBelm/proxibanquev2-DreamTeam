package fr.formation.proxibanquev2.metier;

import java.util.List;

import fr.formation.proxibanquev2.persistance.AccountDao;

public class AccountService {

	public static final AccountService INSTANCE = new AccountService();

	public static AccountService getInstance() {
		return AccountService.INSTANCE;
	}

	private final AccountDao dao;

	public AccountService() {
		this.dao = new AccountDao();
	}

	public List<Account> getAll() {
		return this.dao.readAll();
	}

	public Account readAccount(Integer number) {	
		return this.dao.read(number);
	}
	
	public List<Account> readAllAccountTransfer(Integer id) {
		return this.dao.readAllAccount(id);
	}

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
