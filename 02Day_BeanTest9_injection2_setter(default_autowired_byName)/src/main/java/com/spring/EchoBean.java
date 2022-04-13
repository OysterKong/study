package com.spring;

import java.util.List;

public class EchoBean {
	
	private List valueList;
	private AnotherBean anotherBean;
	
	public String sayEcho() {
		return "hello";
	}
	
	public void getInfo() {
		System.out.println(valueList);
	}
	
	public EchoBean(AnotherBean anotherBean) {
		System.out.println("EchoBean(AnotherBean anotherBean) 생성자 호출됨");
		this.anotherBean = anotherBean;
	}

	public EchoBean() {
	
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

	@Override
	public String toString() {
		return "EchoBean [valueList=" + valueList + ", anotherBean=" + anotherBean + "]";
	}


	
}
