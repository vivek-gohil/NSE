package com.nse.model;

public class UserDetails {
	private String userId;
	private String name;
	private String password;

	public UserDetails(String userId, String name, String password) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
	}

	public UserDetails() {
		// TODO Auto-generated constructor stub
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", name=" + name + ", password=" + password + "]";
	}

}
