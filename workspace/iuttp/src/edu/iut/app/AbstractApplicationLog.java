package edu.iut.app;

import java.util.ArrayList;

public abstract class AbstractApplicationLog implements IApplicationLog {

<<<<<<< HEAD
	protected String message;	
	protected ArrayList<IApplicationLogListener> listeners;
	
	public AbstractApplicationLog() {
		message = null;
		listeners = new ArrayList<IApplicationLogListener>();
	}
	
	abstract void setMessage();
=======
	protected String message;
	/** TP1 : Tableau au sens des collections **/
	protected /*TYPE TABLEAU*/ listeners;
	
	public AbstractApplicationLog() {
		message = null;
		listeners = new /*TYPE TABLEAU*/();
	}
	
    /** TP1 : Fonction venant de l'interface par héritage */

>>>>>>> d7bf8cd49ff3f727388d15617efdf9aaca58d43a

	/** Listener action */
	protected void fireMessage(String level, String message) {
		for (IApplicationLogListener listener_i : listeners) {
			listener_i.newMessage(level, message);
		}
	}
}
