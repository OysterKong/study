package com.dto;

public class TestDTO {
	
	String userid;
	String passwd;
	public TestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TestDTO(String userid, String passwd) {
		super();
		this.userid = userid;
		this.passwd = passwd;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	@Override
	public String toString() {
		return "TestDTO [userid=" + userid + ", passwd=" + passwd + "]";
	}
	
	

}
