package edu.iut.app;

public class ApplicationErrorLog extends AbstractApplicationLog {

	/** Ajouter un tableau ou profiter de l'héritage ? */
	public ApplicationErrorLog() {
		super();
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
		super.fireMessage("[ERROR]", this.message);
	}

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


}
