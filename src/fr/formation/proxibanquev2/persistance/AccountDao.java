package fr.formation.proxibanquev2.persistance;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.formation.proxibanquev2.metier.Account;

public class AccountDao implements Dao<Account>{
	
	private final MySqlConnection  mySqlConn;
	
	public AccountDao(){
		this.mySqlConn = MySqlConnection.getInstance();
	}
	
	@Override
	public List<Account> readAll() {
		List<Account> results = new ArrayList<>();
   try {
	Statement st = this.mySqlConn.getConn().createStatement();
	ResultSet rs = st.executeQuery(SqlQueries.READ_ALL_CLIENT);
	while(rs.next()) {
		String number = rs.getString("number");
		Float balance = rs.getFloat("balance");
		Boolean savings = rs.getBoolean("savings");
		results.add(new Account(number, balance, savings));
	}
   } catch (SQLException e) {
	e.printStackTrace();
   }
		return results;
	}
	

	public Account update(Account entity) {
		return null;		
	}

	@Override
	public Account read(Integer id) {
		return null;
	}

}
