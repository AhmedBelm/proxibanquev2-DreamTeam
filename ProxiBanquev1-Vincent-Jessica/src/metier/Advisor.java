package metier;

import java.util.ArrayList;
import java.util.List;

import persistence.Data;
import presentation.Interaction;

/**
 *Classe définissant un conseiller de banque 
 *possédant une identité et une liste de clients
 */
public class Advisor {

	public String id;
	public List<Customer> customers;
		/**
		 *Constructeur par défaut*
		 */
		public Advisor() {
			this.customers = new ArrayList<>();
		}

		 
		/**
		 *Constructeur d'initialisation
		 */
		public Advisor(String id) {
			this.id=id; 
			this.customers = new ArrayList<>();

		}

		
		@Override
		public String toString() {
			return this.id;
		}
		
				
		public void sayHello (String agencyName) {
			Interaction interaction = new Interaction();
			interaction.display("Bonjour " + this.id 
					+ " de l'agence " + agencyName
					+ " !\r\n");
		}
	}