package ch03;

public class VIPCustomer extends Customer {
	
	//아래는 Customer 에서 상속을 받으므로 별도로 적지않아도 됨.
//	private int customerId;
//	private String customerName;
//	private String customerGrade;
//	int bonusPoint;
//	double bonusRatio;
	
	double salesRatio;
	private String agentId;
	
//	public VIPCustomer() {
//		
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//		customerGrade = "VIP";
//		
//		System.out.println("VIPCustomer() 생성자 호출");
//	}
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) 생성자 호출");
	}

	public String getAgentId() {
		return agentId;
	}

	
	

}
