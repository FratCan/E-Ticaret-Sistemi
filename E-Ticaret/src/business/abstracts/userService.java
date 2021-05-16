package business.abstracts;

import entities.concretes.User;

public interface userService {
	void logIn(User user);
	void register(User user);
	User findUser(String eposta);
}
