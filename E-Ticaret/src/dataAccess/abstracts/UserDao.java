package dataAccess.abstracts;

import entities.concretes.User;

public interface UserDao {
	void logIn(User user);
	void register(User user);
	User findUser(String eposta);
}
