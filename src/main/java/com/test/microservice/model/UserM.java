package com.test.microservice.model;

public class UserM {

	private Integer userId;
	private String fname;
	private String lname;
	private String emailId;
	private String address;
	private String userName;
	private String password;
	private UserType type;
	
	public UserM()
	{}

	public UserM(Integer id, String fname, String lname, String email, String addr, String userName, String pwd,
			UserType type) {
		super();
		this.userId = id;
		this.fname = fname;
		this.lname = lname;
		this.emailId = email;
		this.address = addr;
		this.userName = userName;
		this.password = pwd;
		this.type = type;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

	
	
}
