package core.concretes;

import DýþPaket.GoogleManager;
import core.abstracts.GoogleService;
import entities.concretes.User;

public class GoogleManagerAdapter implements GoogleService{

	@Override
	public void registerr(User user) {
		 
		GoogleManager manager=new GoogleManager();
		manager.register(user);
		
	}

	@Override
	public void logIn(User user) {
		GoogleManager manager=new GoogleManager();
		manager.logIn(user);
		
	}

	 

}
