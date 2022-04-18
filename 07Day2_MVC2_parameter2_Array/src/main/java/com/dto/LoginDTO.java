package com.dto;

import java.util.Arrays;

public class LoginDTO {
	
	String userid;  //loginForm.jsp 의 name 값과 동일하게 작성
	String passwd;  //loginForm.jsp 의 name 값과 동일하게 작성
	String [] phone; //loginForm.jsp 에서 같은 name 값으로 전화번호1, 전하번호2가 있으니 이는 배열로 담겨짐
	String [] chk;  //loginForm.jsp 에서 같은 name 값으로 checkbox가 2개 있으니 이는 배열로 담겨짐

	
	public LoginDTO() {
		super();
		System.out.println("loginDTO 기본생성자 호출 ==============");
		// TODO Auto-generated constructor stub
	}

	public LoginDTO(String userid, String passwd, String[] phone, String[] chk) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		this.phone = phone;
		this.chk = chk;
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

	public String[] getPhone() {
		return phone;
	}

	public void setPhone(String[] phone) {
		this.phone = phone;
	}

	public String[] getChk() {
		return chk;
	}

	public void setChk(String[] chk) {
		this.chk = chk;
	}

	@Override
	public String toString() {
		return "LoginDTO [userid=" + userid + ", passwd=" + passwd + ", phone=" + Arrays.toString(phone) + ", chk="
				+ Arrays.toString(chk) + "]";
	}



}
