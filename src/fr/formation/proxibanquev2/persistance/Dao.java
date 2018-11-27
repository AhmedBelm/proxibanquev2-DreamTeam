package fr.formation.proxibanquev2.persistance;

import java.util.List;



/**
 * presentatio, d'une interface concernant les 4 methodes de manipulation des données élementaires CRUD + readAll
 * @param <T> classe qui représente le type de données manipule par Le Dao
 *
 */

public interface Dao<T> {
	
	
	/**
	 * lit les informations d'une entité en base de données.
	 * @param number l'identifiant unique de l'entité
	 * @return T l'entité construite à partir des informations récuperées
	 */
		
	public T read(Integer number);
	
	/**
	 * met à jour une entité donnée dans la base de données
	 * @param entity l'entité à mettre à jour avec ses nouvelle information
	 * @return T l'entité mise à jour
	 */
	public T update(T entity);
	
	/**
	 * Récupère toutes les entitées (lignes) d'une table
	 * @return List<T> la liste de toutes les entitées lues
	 */
	
	public List<T> readAll();


	
	

}
