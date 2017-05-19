package br.cefet.aps.p1.view;

import br.cefet.aps.p1.control.ControlFacade;

public class UpdatePropina implements Command {

	@Override
	public void execute(String[] args) {
		if(args.length != 9){
			usage();
			return;
		} else{
			try{
				ControlFacade.updatePropina(
						Long.parseLong(args[1]),
						Long.parseLong(args[2]),
						args[3],
						Integer.parseInt(args[4]),
						args[5],
						Integer.parseInt(args[6]), 
						args[7], 
						Integer.parseInt(args[8]));
			}catch(NumberFormatException e){
				usage();
			}
		}
		
	}
	
	public void usage(){
		System.out.println(
						"Usage: insertPropina [oldId] [id] [data] [tipoFavorecido] [apelido] [tipoFavorecimento] [descricao] [estado]\n" +
						"tipoFavorecido: 0 - Pessoa publica | 1 - Pessoa Privada\n" +
						"tipoFavorecimento: 0 - Favor Político | 1 - Vantagem em Licitação | 2 - Informação Privilaegiada |" +
						" 3 - Doação de Campanha\n" +
						"estado: 0 - Paga | 1 - Cancelada"
				);
		
	}

}
