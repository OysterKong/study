package com.spring;

import java.util.Map;

public class EchoBean {
	
	Map<String,AnotherBean> map;
	
	public String sayEcho() {
		return "Hello";
	}

	public EchoBean() {

	}
	
	public Map<String, AnotherBean> getMap() {
		return map;
	}

	public void setMap(Map<String, AnotherBean> map) {
		this.map = map;
	}

	
}
