package fr.formation.proxibanquev2.persistance;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.formation.proxibanquev2.metier.Client;


/**
 * Définition de la classe ClientDao en utilisant l'interface Dao.
 * @author Adminl
 *
 */

public class ClientDao implements Dao<Client> {

	/**
	 * Définition de l'objet mySqlCnn appartenant à la classe MySqlConnection.
	 */
	
	private final MySqlConnection mySqlConn;

	/**
	 * Constructeur par défaut.
	 */
	
	public ClientDao() {
		this.mySqlConn = MySqlConnection.getInstance();
	}


	/**
	 * Constructeur d'initialisation renvoyant une liste de client.
	 */
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

	/**
	 * Constructeur d'initialisation qui prend id en paramètre.
	 */
	
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

	/**
	 * Constructeur d'initialisation qui prend entity en paramètre.
	 */
	
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
