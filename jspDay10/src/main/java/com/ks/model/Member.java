package com.ks.model;

public class Member {
	private String name;
	private String id;
	private String pwd;
	private String email;
	private String gender;
	private String food;
	private String[] interest;
	private String color;
	private String date;
	
	//객체 생성자를 통한 필드 저장(초기화)
	public Member(String name, String id, String pwd, String email, String gender, String food, String[] interest,
			String color, String date) {
		//super();
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.gender = gender;
		this.food = food;
		this.interest = interest;
		this.color = color;
		this.date = date;
	}

	//getter 메소드
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}

	public String getEmail() {
		return email;
	}

	public String getGender() {
		return gender;
	}

	public String getFood() {
		return food;
	}

	public String[] getInterest() {
		return interest;
	}

	public String getColor() {
		return color;
	}

	public String getDate() {
		return date;
	}
	
	
}
