package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import dataBase.DataBase;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	DataBase database=new DataBase();
	@Override
	public void logIn(User user) {
		if(database.Find(user)) {
			System.out.println("Giriþ yapýldý: "+user.getFirstName());
		}else {
			System.out.println("Sisteme kayýt olmalýsýnýz.");
		}
		 
		
	}

	@Override
	public void register(User user) {
		if(database.Find(user)) {
			 System.out.println("Bu eposta önceden alýnmýþ.Yeni bir eposta adresiyle deneyiniz." +user.getFirstName());
		}else {
			database.SaveUser(user);
			System.out.println("Doðrulama epostasý gönderildi.");
		}
		  
		
	}

	@Override
	public User findUser(String eposta) {
		 return database.FindUser(eposta);
	}

}
