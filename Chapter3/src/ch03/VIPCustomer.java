package ch03;

public class VIPCustomer extends Customer {
	
	//�Ʒ��� Customer ���� ����� �����Ƿ� ������ �����ʾƵ� ��.
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
//		System.out.println("VIPCustomer() ������ ȣ��");
//	}
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) ������ ȣ��");
	}

	public String getAgentId() {
		return agentId;
	}

	
	

}
