package br.cefet.aps.p1.model;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is an abstraction of a database.
 * @author Mateus
 *
 */
public class Database {
	//Singleton instance
	private static Database instance;
	private Map<Long, Propina> propinas;
	
	//Singleton
	private Database(){
		super();
		this.propinas = new HashMap<Long, Propina>();
	}
	
	public static Database getInstance(){
		if(instance == null)
			instance = new Database();
		return instance;
	}
	
	//Propina CRUD
	public void insertPropina(Propina p) {
		propinas.put(p.getId(), p);
	}
	
	public void updatePropina(Long id, Propina p) {
		propinas.remove(id);
		propinas.put(p.getId(), p);
	}

	public void deletePropina(Long id) {
		propinas.remove(id);
	}

	public Map<Long, Propina> getPropinas(){
		return this.propinas;
	}

}
