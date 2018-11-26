package fr.formation.proxibanquev2.persistance;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import fr.formation.proxibanquev2.metier.Client;


public class ClientDao implements Dao<Client> {
	
	private final MySqlConnection  mySqlConn;
	
	public ClientDao(){
		this.mySqlConn = MySqlConnection.getInstance();
	}
	
	@Override
	public Client read(Integer id) {
		return null;
	}
	
	@Override
	public List<Client> readAll() {
		List<Client> results = new ArrayList<>();
   try {
	Statement st = this.mySqlConn.getConn().createStatement();
	ResultSet rs = st.executeQuery(SqlQueries.READ_ALL_CLIENT);
	while(rs.next()) {
		String firstname = rs.getString("firstname");
		String lastname = rs.getString("lastname");
		String email = rs.getString("email");
		String address = rs.getString("address");
		results.add(new Client(firstname, lastname, email, address));
	}
   } catch (SQLException e) {
	e.printStackTrace();
   }
		return results;
	}
	

	public Client update(Client entity) {
		return null;		
	}


}