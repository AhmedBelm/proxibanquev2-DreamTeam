package fr.formation.proxibanquev2.persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class MySqlConnection {
	
		 private static final MySqlConnection INSTANCE = new MySqlConnection();
		 
		 public static MySqlConnection  getInstance() {
			 return MySqlConnection.INSTANCE;
		 }
		
		 private Connection conn;
		 
		 public Connection getConn() {
			return conn;
		}

		public MySqlConnection() {
			 try {
				 Class.forName("com.mysql.cj.jdbc.Driver");
				this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blog1?serverTimezone=Europe/Paris", "root", "root");
			} catch (SQLException e) {
				e.printStackTrace();
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			 
		 }
		 

}
