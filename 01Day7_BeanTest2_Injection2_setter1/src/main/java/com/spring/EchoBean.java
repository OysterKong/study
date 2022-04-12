package com.spring;

public class EchoBean {
	
	String aaa;
	public String sayEcho() {
		return "hello";
	}
	public EchoBean() {
		System.out.println("기본생성자 호출");
	}
	public String getAaa() {
		return aaa;
	}
	public void setMesg(String mesg) {
		System.out.println("setMesg(String mesg)");
		this.aaa = mesg;
	}
	
	

}
