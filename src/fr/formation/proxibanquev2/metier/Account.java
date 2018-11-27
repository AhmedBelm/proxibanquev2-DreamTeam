package fr.formation.proxibanquev2.metier;

/**
 * Représentation d'un compte bancaire générique.
 */
public class Account {

	/**
	 * Identifiant technique base de données.
	 */
	private Integer id;

	/**
	 * Identifiant métier, numéro du compte sur 9 chiffres.
	 */
	private String number;

	/**
	 * Stockage du solde actuel de ce compte en €.
	 */
	private Float balance;

	/**
	 * Si vrai, c'est un compte épargne, sinon c'est un compte courant.
	 */
	private boolean savings;
	
	/**
	 * Identifiant technique correspondant à la clé secondaire dans la table Account.
	 */
	
	private Integer id_client;

	/**
	 * Constructeur d'initialisation de la classe Account.
	 */
	
	public Account() {
		this.savings = false;
		this.balance = 0F;
	}

	/**
	 * Constructeur d'initialisation prenant number et balance en paramètres.
	 * @param number
	 * @param balance
	 */
	
	public Account(String number, Float balance) {
		this();
		this.number = number;
		this.balance = balance;
	}

	/**
	 * Constructeur d'initialisation prenant number, balance, savings en paramètres.
	 * @param number
	 * @param balance
	 * @param savings
	 */
	
	public Account(String number, Float balance, boolean savings) {
		this(number, balance);
		this.savings = savings;
	}
	
	/**
	 * Constructeur d'initialisation prenant id, number, balance, savings en paramètres.
	 * @param id
	 * @param number
	 * @param balance
	 * @param savings
	 */

	public Account(Integer id, String number, Float balance, boolean savings) {
        this(number, balance, savings);
        this.id = id;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Float getBalance() {
		return balance;
	}

	public void setBalance(Float balance) {
		this.balance = balance;
	}

	public boolean isSavings() {
		return savings;
	}

	public void setSavings(boolean savings) {
		this.savings = savings;
	}

	public Integer getId_client() {
		return id_client;
	}

	public void setId_client(Integer id_client) {
		this.id_client = id_client;
	}
	
}
