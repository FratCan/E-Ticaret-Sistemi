package dataBase;

import java.util.ArrayList;

import entities.concretes.User;

public class DataBase {

	ArrayList<User> userlist = new ArrayList<User>();
	ArrayList<String> maillist = new ArrayList<String>();
	public void SaveUser(User user) {
		userlist.add(user);
		maillist.add(user.getEposta());
	}
	
	public boolean Find(User user) {
		if(maillist.contains(user.getEposta())) {
			return true;
		}
		return false;
	}
	public User FindUser(String mail) {
		for (int k = 0 ;k< maillist.size() ;k++) {
			if(maillist.get(k)== mail) {
				return userlist.get(k);
			}
		}
		return new User();
	}
}
