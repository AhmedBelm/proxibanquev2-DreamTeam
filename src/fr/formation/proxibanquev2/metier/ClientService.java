package fr.formation.proxibanquev2.metier;

import java.util.List;
import fr.formation.proxibanquev2.persistance.ClientDao;

/**
 * Constructeur de la super classe ClientService. 
 * @author Adminl
 *
 */

public class ClientService {

	
	/**
	 * Création de l'objet INSTANCE de la classe ClientService. 
	 */
	
	public static final ClientService INSTANCE = new ClientService();
	
	public static ClientService getInstance() {
		return ClientService.INSTANCE;
	}
	
	/**
	 * Déclaration de dao un objet de la classe ClientDao
	 */
	
	private final ClientDao dao;
	
	/**
	 * Constructeur par défaut.
	 */
	
	public ClientService() {
		this.dao = new ClientDao();
	}
	
	public List<Client> getAll(){
		 return this.dao.readAll();
	 }

	/**
	 * Définition de la méthode updateClient prenant id, lastname, firstname, email, adresse comme paramètre.
	 * @param id
	 * @param lastname
	 * @param firstname
	 * @param email
	 * @param address
	 */
	
	public void updateClient(Integer id,String lastname, String firstname, String email, String address) {
		this.dao.update(new Client(id, lastname, firstname, email, address));
	}
	
	/**
	 * Définition de la méthode readClient prenant id comme paramètre.
	 * @param id
	 * @return
	 */

	public Client readClient(Integer id) {
		return this.dao.read(id);
	}
	
	
}
