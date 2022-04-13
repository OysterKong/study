package com.spring;

import java.util.List;

public class EchoBean {
	
	List valueList;
	
	public String sayEcho() {
		return "hello";
	}

	public EchoBean() {
		super();
		System.out.println("===========================");
	}

	public EchoBean(List valueList) {
		super();
		this.valueList = valueList;
	}

	public List getValueList() {
		return valueList;
	}

	public void setValueList(List valueList) {
		this.valueList = valueList;
	}
	

}
