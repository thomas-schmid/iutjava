package edu.iut.app;

public class ApplicationInfoLog extends AbstractApplicationLog {

	/** Ajouter un tableau ou profiter de l'héritage ? */
	public ApplicationInfoLog() {
		super();
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
        super.fireMessage("[INFO]", this.message);
	}

<<<<<<< HEAD
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addListener(IApplicationLogListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IApplicationLogListener[] getpplicationLogListeners() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	void setMessage() {
		// TODO Auto-generated method stub
		
	}

=======
>>>>>>> d7bf8cd49ff3f727388d15617efdf9aaca58d43a
}
