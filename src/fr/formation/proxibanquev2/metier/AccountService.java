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

	
	public List<Account> readAllAccountService(Integer id_client) {
		return this.dao.readAllAccount(id_client);
	}
		
	
}
