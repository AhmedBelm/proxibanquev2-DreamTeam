package fr.formation.proxibanquev2.persistance;

public class SqlQueries {
	
	public static final String READ_ALL_CLIENT = "select * from client;";
	public static final String UPDATE_CLIENT = "update client set %s where id=%s;";
	public static final String READ_ACCOUNT_BY_NUMBER = "select  * from account where number=%s;";
	public static final String READ_ACCOUNT = "Select * from Account where id_client=%s;";
	public static final String UPDATE_ACCOUNT = "Update account set balance=%s where number=%s;";

}
