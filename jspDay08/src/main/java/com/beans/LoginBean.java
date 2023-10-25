package com.beans;

public class LoginBean {
	private String id;
	private String pwd;
	
	public LoginBean() {
		
	}
	
	public LoginBean(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}
	
	public boolean checkUser(String id, String pwd) {
		System.out.println("checkUser(){ this.id: "+this.id);
		return this.id.equals(id) && this.pwd.equals(pwd);
	}
}
