package entities.concretes;

import entities.abstracts.Entitiy;

public class User implements Entitiy {
	private String firstName;
	private String lastName;
	private String password;
	private String eposta;
	
	public User() {
		
	}
	
	public User(String firstName,String lastName, String password, String eposta) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.eposta = eposta;
	}
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEposta() {
		return eposta;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}

	 
}
