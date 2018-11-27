package fr.formation.proxibanquev2.persistance;

public class SqlQueries {
	
	public static final String READ_ALL_CLIENT= "Select * from Client;";
	
	public static final String UPDATE_CLIENT = "UPDATE Client SET lastname='%s', firstname='%s', email='%s', address='%s' where id=%s;";
	public static final String READ_CLIENT = "Select * from Client where id=%s;";

	public static final String READ_ACCOUNT = "Select * from Account where id_client=%s;";
	

}
