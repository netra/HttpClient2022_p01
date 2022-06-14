package com.apex.data;

public class NewUser {
	
	String email;
	String password;
	
	public NewUser(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "NewUser [email=" + email + ", password=" + password + "]";
	}
	
	

}
