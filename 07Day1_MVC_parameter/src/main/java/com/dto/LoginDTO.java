package com.dto;

public class LoginDTO {
	
	private String userid;  //loginForm.jsp �� name ���� �����ϰ� �ۼ�
	private String passwd;  //loginForm.jsp �� name ���� �����ϰ� �ۼ�
	
	public LoginDTO() {
		super();
		System.out.println("loginDTO �⺻������ ȣ�� ==============");
		// TODO Auto-generated constructor stub
	}
	
	public LoginDTO(String userid, String passwd) {
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
		return "LoginDTO [userid=" + userid + ", passwd=" + passwd + "]";
	}
	
	
	


}
