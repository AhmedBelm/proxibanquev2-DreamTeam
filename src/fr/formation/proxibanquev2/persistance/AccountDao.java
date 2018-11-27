package fr.formation.proxibanquev2.persistance;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.formation.proxibanquev2.metier.Account;


/**
 * Définition de la classe AccountDao en utilisant l'interface Dao.
 * @author Adminl
 *
 */

public class AccountDao implements Dao<Account>{
	
	/**
	 * Définition de l'objet mySqlCnn appartenant à la classe MySqlConnection.
	 */
	
	private final MySqlConnection  mySqlConn;
	
	/**
	 * Constructeur par défaut de AccountDao.
	 */
	
	public AccountDao(){
		this.mySqlConn = MySqlConnection.getInstance();
	}
	
	/**
	 * Constructeur readAllAccount qui prend en paramètre id_client la clés secondaire de la table Account et qui retourne une liste de données contenue dans la table Account.
	 * Cette méthode permet de lire toute la table Account.
	 * @param id_client
	 * @return
	 */
	
	public List<Account> readAllAccount(Integer id_client) {
	       List<Account> results = new ArrayList<>();
	        try {
	               Statement st = this.mySqlConn.getConn().createStatement();
	               ResultSet rs= st.executeQuery(String.format(SqlQueries.READ_ACCOUNT, id_client));
	               while(rs.next()) {
	                   int id = rs.getInt("id");
	                   String number = rs.getString("number");
	                   Float balance = rs.getFloat("balance");
	                   String savings = rs.getString("savings");
	                   results.add(new Account(id, number, balance, savings.equals("Y")));
	               }
	              } catch (SQLException e) {
	               e.printStackTrace();
	              }
	                   return results;
	    }


	/**
	 * Constructeur par défaut prenant number en paramètre.
	 */
	
	public Account read(Integer number) {
		return null;
	}
	
	/**
	 * Constructeur prenant numberA qui correspond au nom du compte client émétteur et qui renvoi un Account.
	 * @param numberA
	 * @return
	 */

	public Account readByNumber(Integer numberA) {	
		
		Account result = null;
		
		try {
		Statement st = this.mySqlConn.getConn().createStatement();
		ResultSet rs = st.executeQuery(String.format(SqlQueries.READ_ACCOUNT_BY_NUMBER, numberA));
		while(rs.next()) {
			Float balance = rs.getFloat("balance");
			result = new Account(numberA.toString(), balance);
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}


	@Override
	public List<Account> readAll() {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public Account update(Account entity) {
		try {
			Statement st = this.mySqlConn.getConn().createStatement();
			st.executeUpdate(String.format(SqlQueries.UPDATE_ACCOUNT, entity.getBalance(), entity.getNumber()));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return entity;
	}


}
