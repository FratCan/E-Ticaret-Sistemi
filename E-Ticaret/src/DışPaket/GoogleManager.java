package DýþPaket;

import entities.concretes.User;

public class GoogleManager {
	public void register(User user) {
		System.out.println("Sisteme google ile kayýt olundu: "+user.getFirstName());
	}
	public void logIn(User user) {
		System.out.println("Sisteme google ile giriþ yapýldý: "+user.getFirstName());
	}
	
}
