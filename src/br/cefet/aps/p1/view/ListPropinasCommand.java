package br.cefet.aps.p1.view;

import java.util.List;

import br.cefet.aps.p1.control.ControlFacade;
import br.cefet.aps.p1.model.Propina;

public class ListPropinasCommand implements Command{

	@Override
	public void execute(String[] args) {
		List<Propina> propinas = ControlFacade.listPropinas();
		for(Propina propina : propinas){
			String message = "";
			message += "Id: " + propina.getId();
			message += "\nData: " + propina.getData();
			message += "\nFavorecido: " + propina.getFavorecido().getApelido();
			message += " Tipo: " + propina.getFavorecido().getTipoFavorecido().tipo();
			message += "\nFavoremento: " + propina.getFavorecimento().getTipoFavorecimento().tipo();
			message += " Tipo: " + propina.getFavorecimento().getTipoFavorecimento().tipo();
			message += "\nEstado: " + propina.getState().estado();
			message += "\nValor: " + propina.calculaPagamentoTemplate();
			message += "\nDescrição: " + propina.getFavorecimento().getDescricao();
			
			System.out.println(message);
			System.out.println("\n");
		}
		
	}

}
