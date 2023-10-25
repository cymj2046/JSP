package com.beans;

public class LoginBean {
	private String id;
	private String pwd;
	
	public LoginBean() {
		this.id = "smart";
		this.pwd = "1234";
	}
	
	public boolean checkUser(String id, String pwd) {
		return this.id.equals(id) && this.pwd.equals(pwd);
	}
}
