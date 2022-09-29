package com.naver.myhome3.model;

public class Join {
	private		String id;
	private		String pass;
	private		String jumin1;
	private		String jumin2;
	private		String email;
	private		String domain;
	private		String gender;
	private		String[] hobby;
	private		String post1;
	private		String address;
	private		String intro;
	
	public String getDomain() {
		System.out.println("getDomain() this.domain = " + this.domain);
		return domain;
    }
  
    public void setDomain(String domain) {
    	System.out.println("setDomain() domain = " + domain);
    	this.domain = domain;
    }

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getJumin1() {
		return jumin1;
	}
	public void setJumin1(String jumin1) {
		this.jumin1 = jumin1;
	}
	public String getJumin2() {
		return jumin2;
	}
	public void setJumin2(String jumin2) {
		this.jumin2 = jumin2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	public String getPost1() {
		return post1;
	}
	public void setPost1(String post1) {
		this.post1 = post1;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
}
