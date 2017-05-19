package br.cefet.aps.p1.view;

import br.cefet.aps.p1.control.ControlFacade;

public class InsertPropinaCommand implements Command {

	@Override
	public void execute(String[] args) {
		if(args.length != 8){
			usage();
			return;
		} else{
			try{
				ControlFacade.insertPropina(
						Long.parseLong(args[1]),
						args[2],
						Integer.parseInt(args[3]),
						args[4],
						Integer.parseInt(args[5]), 
						args[6], 
						Integer.parseInt(args[7]));
			}catch(NumberFormatException e){
				usage();
			}
		}
		
	}
	
	public void usage(){
		System.out.println(
						"Usage: insert id data tipoFavorecido apelido tipoFavorecimento descricao estado\n" +
						"tipoFavorecido: 0 - Pessoa publica | 1 - Pessoa Privada\n" +
						"tipoFavorecimento: 0 - Favor Político | 1 - Vantagem em Licitação | 2 - Informação Privilaegiada |" +
						" 3 - Doação de Campanha\n" +
						"estado: 0 - Paga | 1 - Cancelada"
				);
		
	}

}
