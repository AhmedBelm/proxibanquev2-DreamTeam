package fr.formation.proxibanquev2.metier;

import java.util.ArrayList;
import java.util.List;

/**
 * Représentation d'un client de la banque.
 */
public class Client {

	/**
	 * Identifiant technique base de données.
	 */
	private Integer id;

	private String firstname;

	private String lastname;

	private String email;

	private String address;
	
	/**
	 * Constructeur d'initialisation de la classe client en prenant id, firstname, lastname, email, address commen paramètre.
	 * @param id
	 * @param firstname
	 * @param lastname
	 * @param email
	 * @param address
	 */

	public Client(Integer id, String firstname, String lastname, String email,
			String address) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.address = address;
	}
	/**
	 * Liste des comptes du client.
	 */
	private List<Account> accounts;

	/**
	 * Constructeur par défaut.
	 */
	
	public Client() {
		this.accounts = new ArrayList<>();
	}

	/**
	 * Constructeur d'initilisation en prenant firstname, lastname, email, address comme paramètres.
	 * @param firstname
	 * @param lastname
	 * @param email
	 * @param address
	 */
	
	public Client(String firstname, String lastname, String email,
			String address) {
		this();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.address = address;
	}


	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

}
