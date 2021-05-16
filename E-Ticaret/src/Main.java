 

import java.util.Scanner;

import business.abstracts.userService;
import business.concretes.userManager;
import core.abstracts.GoogleService;
import core.concretes.GoogleManagerAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		 
		 
		
	    userService userService= new userManager(new HibernateUserDao());
	    GoogleService service=new GoogleManagerAdapter();
	    
	    Scanner s =new Scanner(System.in);
	    
	    System.out.println("E-Ticaret sitemize hoþgeldiniz.");
	    String transactions ="0 register "+"1 logIn";
	    System.out.println(transactions);
	    
	    int a=s.nextInt();
	    s.nextLine();
	    switch(a) {
	    case 1: String transactions2="2 eposta ile giriþ yap."+"3 google hesabý ile giriþ yap.";
	    	System.out.println(transactions2);
	    	
	         	int a2 = s.nextInt();
			    s.nextLine();
			    switch(a2) {
			   case 2:
			     System.out.println("epsota:");
			     String eposta=s.nextLine();
			     System.out.println("password:");
			     String passwod=s.nextLine();
			     userService.logIn(userService.findUser(eposta));
			     break;
			   case 3:
				    System.out.println("gmail:");
				    String eposta2=s.nextLine();
				    System.out.println("password:");
				    String password2=s.nextLine();
				    service.logIn(userService.findUser(eposta2));
				    break;
			    }
		case 0:
			System.out.println("Name:");
			String name = s.nextLine();
			System.out.println("Last name: ");
			String lastName = s.nextLine();
			System.out.println("eposta: ");
			String eposta3 = s.nextLine();
			System.out.println("Password: ");
			String password2 = s.nextLine();
			User user =new User(name,lastName,eposta3,password2);
			userService.register(user);
			Thread.sleep(2000);
			System.out.println("Doðrulama epostasý doðrulandý");
			break;
				    
			    }
	    }
	     /*
	    User user=new User();
		user.setFirstName("Fýrat");
		user.setLastName("Özdemir");
		user.setEposta("can6240@hotmail.com");
		user.setPassword("111111");
		userService.logIn(user);
		*/
	}


