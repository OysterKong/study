package com.spring;

import java.util.List;

public class EchoBean {
	
	List valueList;
	AnotherBean anotherBean;

	
	public String sayEcho() {
		return "hello";
	}

	public EchoBean() {
		super();
		System.out.println("===========================");
	}

	public EchoBean(List valueList, AnotherBean anotherBean) {
		super();
		this.valueList = valueList;
		this.anotherBean = anotherBean;
	}

	public List getValueList() {
		return valueList;
	}

	public void setValueList(List valueList) {
		this.valueList = valueList;
	}

	public AnotherBean getAnotherBean() {
		return anotherBean;
	}

	public void setAnotherBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}
	

}
