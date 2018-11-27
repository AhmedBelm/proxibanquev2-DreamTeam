package fr.formation.proxibanquev2.persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Constructeur de la super classe MySqlConnection permettant la connexion à notre base de données.
 * @author Adminl
 *
 */

public class MySqlConnection {
	
		 private static final MySqlConnection INSTANCE = new MySqlConnection();
		 
		 public static MySqlConnection  getInstance() {
			 return MySqlConnection.INSTANCE;
		 }
		
		 private Connection conn;
		 
		 public Connection getConn() {
			return conn;
		}

		 /**
		  * Chargement des pilotes de connexion à notre base de données.
		  */
		 
		public MySqlConnection() {
			 try {
				 Class.forName("com.mysql.cj.jdbc.Driver");
				this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proxibanquev2?serverTimezone=Europe/Paris", "root", "root");
			} catch (SQLException e) {
				e.printStackTrace();
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			 
		 }
		 

}
