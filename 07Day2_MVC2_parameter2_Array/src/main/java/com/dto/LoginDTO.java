package com.dto;

import java.util.Arrays;

public class LoginDTO {
	
	String userid;  //loginForm.jsp �� name ���� �����ϰ� �ۼ�
	String passwd;  //loginForm.jsp �� name ���� �����ϰ� �ۼ�
	String [] phone; //loginForm.jsp ���� ���� name ������ ��ȭ��ȣ1, ���Ϲ�ȣ2�� ������ �̴� �迭�� �����
	String [] chk;  //loginForm.jsp ���� ���� name ������ checkbox�� 2�� ������ �̴� �迭�� �����

	
	public LoginDTO() {
		super();
		System.out.println("loginDTO �⺻������ ȣ�� ==============");
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
