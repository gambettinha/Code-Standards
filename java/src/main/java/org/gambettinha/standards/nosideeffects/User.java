package org.gambettinha.standards.nosideeffects;

public class User {

	private String name;
	private String passwd;
	
	public User(){}
	
	public User(String name){
		this.name = name;
	}
	
	public User(String name, String passwd){
		this.name = name;
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public String getPasswd() {
		return passwd;
	}
	
}
