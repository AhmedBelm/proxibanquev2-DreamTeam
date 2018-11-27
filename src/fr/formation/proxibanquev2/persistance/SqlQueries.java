package fr.formation.proxibanquev2.persistance;

public class SqlQueries {
	
	/**
	 * Déclaration des requête sql utlisé tout au long de notre java.
	 */
	
	public static final String READ_ALL_CLIENT= "Select * from Client;";
	public static final String UPDATE_CLIENT = "UPDATE Client SET lastname='%s', firstname='%s', email='%s', address='%s' where id=%s;";
	public static final String READ_CLIENT = "Select * from Client where id=%s;";

	public static final String READ_ACCOUNT = "Select * from Account where id_client=%s;";
	public static final String UPDATE_ACCOUNT = "Update account set balance=%s where number=%s;";
	public static final String READ_ACCOUNT_BY_NUMBER = "select  * from account where number=%s;";

}
