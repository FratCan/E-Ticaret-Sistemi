package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import dataBase.DataBase;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	DataBase database=new DataBase();
	@Override
	public void logIn(User user) {
		if(database.Find(user)) {
			System.out.println("Giri� yap�ld�: "+user.getFirstName());
		}else {
			System.out.println("Sisteme kay�t olmal�s�n�z.");
		}
		 
		
	}

	@Override
	public void register(User user) {
		if(database.Find(user)) {
			 System.out.println("Bu eposta �nceden al�nm��.Yeni bir eposta adresiyle deneyiniz." +user.getFirstName());
		}else {
			database.SaveUser(user);
			System.out.println("Do�rulama epostas� g�nderildi.");
		}
		  
		
	}

	@Override
	public User findUser(String eposta) {
		 return database.FindUser(eposta);
	}

}
