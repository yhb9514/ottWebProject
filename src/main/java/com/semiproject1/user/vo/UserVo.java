package com.semiproject1.user.vo;

public class UserVo {
	private String email; 
	private String pwd;
	private String name; 
	private String phoneNumber; 
	private String birthDate;
	public UserVo() {}
	
	public UserVo(String email, String pwd, String name, String phoneNumber, String birthDate) {
		super();
		this.email = email;
		this.pwd = pwd;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthDate = birthDate;
	}
	
	@Override
	public String toString() {
		
		return super.toString();
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
}
