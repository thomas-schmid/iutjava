package edu.iut.app;

import java.util.ArrayList;


public class ApplicationLogs extends ArrayList<IApplicationLog> {

	public ApplicationLogs() {		
	}
	
	public ArrayList<IApplicationLog> getErrors() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
<<<<<<< HEAD
		for (IApplicationLog log : this) {
			if(log instanceof ApplicationErrorLog) 
				filteredLogs.add(log);
		}
=======
		// une boucle à faire ici, penser à utiliser instanceof
>>>>>>> d7bf8cd49ff3f727388d15617efdf9aaca58d43a
		return filteredLogs;
	}
	public ArrayList<IApplicationLog> getWarnings() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
<<<<<<< HEAD
		for (IApplicationLog log : this) {
			if(log instanceof ApplicationWarningLog) 
				filteredLogs.add(log);
		}
=======
		// une boucle à faire ici, penser à utiliser instanceof
>>>>>>> d7bf8cd49ff3f727388d15617efdf9aaca58d43a
		return filteredLogs;
	}
	public ArrayList<IApplicationLog> getInfos() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
<<<<<<< HEAD
		for (IApplicationLog log : this) {
			if(log instanceof ApplicationInfoLog) 
				filteredLogs.add(log);
		}
		return filteredLogs;
	}
	
=======
		// une boucle à faire ici, penser à utiliser instanceof
		return filteredLogs;
	}
	

>>>>>>> d7bf8cd49ff3f727388d15617efdf9aaca58d43a
}
