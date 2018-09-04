package com.sn.database.objects;

import java.util.List;

public class User {
	private String email;
	private String firstName;
	private String password;
	private List<String> interests;
	
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public List<String> getInterests() {
		return interests;
	}
	public void setInterests(List<String> interests) {
		this.interests = interests;
	}
	
	public void addInterest(String interest) {
		if(this.interests != null) {
			interests.add(interest);
		}
	}
}
