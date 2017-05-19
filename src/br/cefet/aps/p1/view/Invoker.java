package br.cefet.aps.p1.view;

import java.util.HashMap;
import java.util.Map;

public class Invoker {
	public static Map<String, Command> commands;
	
	static{
		commands = new HashMap<String, Command>();

		commands.put("addPropina", new InsertPropinaCommand());
		commands.put("updatePropina", new UpdatePropina());
		commands.put("deletePropina", new DeletePropinaCommand());
		commands.put("listPropinass", new ListPropinasCommand());
		
	}
	
	public static boolean executeCommand(String action, String[] parameters){
		if(!commands.containsKey(action)){
			System.out.println("Command " + action + " not found");
			return false;
		}
		commands.get(action).execute(parameters);
		return true;
	}

}
