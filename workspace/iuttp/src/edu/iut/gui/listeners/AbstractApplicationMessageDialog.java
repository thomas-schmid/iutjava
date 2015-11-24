package edu.iut.gui.listeners;

import edu.iut.app.IApplicationLogListener;

public abstract class AbstractApplicationMessageDialog implements
		IApplicationLogListener {

	@Override
	public void newMessage(String level, String message) {
<<<<<<< HEAD
		showMessage(level, message);
	}
	
	 abstract protected void showMessage(String level, String message);
	 
=======
	 /* TP1 : CODE A FOURNIR */*
	}
	
	/* TP1 ajouter une méthode abstraite showMessage */

>>>>>>> d7bf8cd49ff3f727388d15617efdf9aaca58d43a
}
