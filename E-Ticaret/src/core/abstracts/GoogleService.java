package core.abstracts;

 
import entities.concretes.User;

public interface GoogleService  {
	void registerr(User user);
	void logIn(User user);
}
