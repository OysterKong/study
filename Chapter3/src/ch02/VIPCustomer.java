package ch02;

public class VIPCustomer extends Customer {
	
	//�Ʒ��� Customer ���� ����� �����Ƿ� ������ �����ʾƵ� ��.
//	private int customerId;
//	private String customerName;
//	private String customerGrade;
//	int bonusPoint;
//	double bonusRatio;
	
	double salesRatio;
	private String agentId;
	
	public VIPCustomer() {
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
	}

	public String getAgentId() {
		return agentId;
	}

	
	

}
