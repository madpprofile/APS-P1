package br.cefet.aps.p1.control;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.cefet.aps.p1.model.Database;
import br.cefet.aps.p1.model.Propina;

public class ControlFacade {
	
	public static void insertPropina(Long id, String data, int tipoFavorecido, String apelido,
			int tipoFavorecimento, String descricao, int estado){
		Propina p = PropinaFactory.createPropina(id, data, tipoFavorecido, apelido, tipoFavorecimento, descricao, estado);
		Database.getInstance().insertPropina(p);
		
	}
	
	public static void updatePropina(Long oldId, Long id, String data, int tipoFavorecido, String apelido,
			int tipoFavorecimento, String descricao, int estado){
		Propina p = PropinaFactory.createPropina(id, data, tipoFavorecido, apelido, tipoFavorecimento, descricao, estado);
		Database.getInstance().updatePropina(id, p);
	}
	
	public static void deletePropina(Long id){
		Database.getInstance().deletePropina(id);
	}
	
	public static List<Propina> listPropinas(){
		Database db = Database.getInstance();
		Map<Long, Propina> propinas = db.getPropinas();
		List<Propina> propinasList = propinas.entrySet().stream()
				.map(id -> id.getValue()).collect(Collectors.toList());
		return propinasList;
	}

}
