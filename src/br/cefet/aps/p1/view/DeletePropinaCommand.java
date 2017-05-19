package br.cefet.aps.p1.view;

import br.cefet.aps.p1.control.ControlFacade;

public class DeletePropinaCommand implements Command {

	@Override
	public void execute(String[] args) {
		if(args.length != 2){
			usage();
			return;
		} else{
			try{
				ControlFacade.deletePropina(Long.parseLong(args[1]));
			}catch(NumberFormatException e){
				usage();
			}
		}
		
	}
	
	public void usage(){
		System.out.println("Usage: id\n");
		
	}

}
