package com.spring;

import java.util.List;

public class EchoBean {
	
	List<AnotherBean> valueList;  
	AnotherBean anotherBean;

	
	public String sayEcho() {
		return "hello";
	}

	public EchoBean() { //기본생성자
		super();
	}
	public EchoBean( AnotherBean anotherBean ) {
		super();
		this.anotherBean = anotherBean;
	}

	public List<AnotherBean> getValueList() {
		return valueList;
	}

	public void setValueList(List<AnotherBean> valueList) {
		this.valueList = valueList;
	}

	public AnotherBean getAnotherBean() {
		return anotherBean;
	}

	public void setAnotherBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}
	


}
