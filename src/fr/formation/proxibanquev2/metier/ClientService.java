package fr.formation.proxibanquev2.metier;

import java.util.List;

import fr.formation.proxibanquev2.persistance.ClientDao;

public class ClientService {

	public static final ClientService INSTANCE = new ClientService();
	
	public static ClientService getInstance() {
		return ClientService.INSTANCE;
	}
	
	private final ClientDao dao;
	
	public ClientService() {
		this.dao = new ClientDao();
	}
	
	public List<Client> getAll(){
		 return this.dao.readAll();
	 }

	public void updateClient(Integer id, String lastname, String firstname, String email, String address) {
		this.dao.update(new Client(id, lastname, firstname, email, address));
	}
	
	
}
