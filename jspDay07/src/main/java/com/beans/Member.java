package com.beans;

//id, pwd, name 필드로 하는 클래스 생성
public class Member {
	private String id;
	private String pwd;
	private String name;
	public String getId() {
		return id;
	}
	
	//getter / setter 만들기
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
