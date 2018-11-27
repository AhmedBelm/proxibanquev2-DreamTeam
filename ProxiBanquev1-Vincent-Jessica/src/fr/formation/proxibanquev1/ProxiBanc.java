package fr.formation.proxibanquev1;
import metier.DataManagement;

/**
 *Classe de la méthode main
 *Le programme démarre ici
 */
public class ProxiBanc {
	
	public static void main(String[] args) {
		boolean startAgain;
		do {
			 startAgain = false;
//			try {
				DataManagement dataManagement = new DataManagement();
				dataManagement.start();
//			}catch(Exception e) {
//				System.out.println("Exception : " + e);
//				startAgain = true;
//			}
		}while(startAgain);
}
}