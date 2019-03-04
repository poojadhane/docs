package com.trianing;

public class Account 
{
	String name,email;

	public Account() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", email=" + email + "]";
	}

	public Account(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	
}
