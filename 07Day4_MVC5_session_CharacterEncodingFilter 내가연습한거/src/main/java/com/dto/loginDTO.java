package com.dto;

public class loginDTO {

	String username;
	String passwd;
	public loginDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public loginDTO(String username, String passwd) {
		super();
		this.username = username;
		this.passwd = passwd;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	@Override
	public String toString() {
		return "loginDTO [username=" + username + ", passwd=" + passwd + "]";
	}
	
	
		
}
