package com.entity;

public class OrderDTO {
	
	int num;
	  String pcode;
	  int qnantity;
	
	  public OrderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	  public OrderDTO(int num, String pcode, int qnantity) {
		super();
		this.num = num;
		this.pcode = pcode;
		this.qnantity = qnantity;
	}
	
	  public int getNum() {
		return num;
	}
	
	  public void setNum(int num) {
		this.num = num;
	}
	
	  public String getPcode() {
		return pcode;
	}
	
	  public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	
	  public int getQnantity() {
		return qnantity;
	}
	
	  public void setQnantity(int qnantity) {
		this.qnantity = qnantity;
	}
	
	  @Override
	public String toString() {
		return "OrderDTO [num=" + num + ", pcode=" + pcode + ", qnantity=" + qnantity + "]";
	}

	  
}
