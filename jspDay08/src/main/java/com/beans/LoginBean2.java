package com.beans;

public class LoginBean2 {
	private String id;
	private String pwd;
	
	public LoginBean2() {
		this.id = "smart";
		this.pwd = "1234";
	}
	
	//public LoginBean2(String id, String pwd) {
	//	this.id = "";
	//	this.pwd = "";
	//}
	
	public boolean checkUser(String id, String pwd) {
		System.out.println("checkUser(){ this.id: "+this.id);
		return this.id.equals(id) && this.pwd.equals(pwd);
	}
}
