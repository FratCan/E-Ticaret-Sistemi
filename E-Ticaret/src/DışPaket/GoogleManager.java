package D��Paket;

import entities.concretes.User;

public class GoogleManager {
	public void register(User user) {
		System.out.println("Sisteme google ile kay�t olundu: "+user.getFirstName());
	}
	public void logIn(User user) {
		System.out.println("Sisteme google ile giri� yap�ld�: "+user.getFirstName());
	}
	
}
