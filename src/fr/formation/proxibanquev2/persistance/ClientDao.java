package fr.formation.proxibanquev2.persistance;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.formation.proxibanquev2.metier.Client;

public class ClientDao implements Dao<Client> {

	private final MySqlConnection mySqlConn;

	public ClientDao() {
		this.mySqlConn = MySqlConnection.getInstance();
	}


	@Override
	public List<Client> readAll() {
		List<Client> results = new ArrayList<>();
		try {
			Statement st = this.mySqlConn.getConn().createStatement();
			ResultSet rs = st.executeQuery(SqlQueries.READ_ALL_CLIENT);
			while (rs.next()) {
				Integer id = Integer.parseInt(rs.getString("id"));
				String firstname = rs.getString("firstname");
				String lastname = rs.getString("lastname");
				String email = rs.getString("email");
				String address = rs.getString("address");
				results.add(new Client(id, firstname, lastname, email, address));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return results;
	}

	public Client read(Integer id) {
		Client client = null;
		try {
			Statement st = this.mySqlConn.getConn().createStatement();
			ResultSet rs = st.executeQuery(String.format(SqlQueries.READ_CLIENT, id));
			while (rs.next()) {
				String lastname = rs.getString("lastname");
				String firstname = rs.getString("firstname");
				String email = rs.getString("email");
				String address = rs.getString("address");
				client = new Client(firstname, lastname, email, address);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return client;
	}

	public Client update(Client entity) {
		Statement st;
		try {
			st = this.mySqlConn.getConn().createStatement();
			String query = String.format(SqlQueries.UPDATE_CLIENT, entity.getLastname(), entity.getFirstname(), entity.getEmail(), entity.getAddress(), entity.getId());
			st.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return entity;
	}

}
