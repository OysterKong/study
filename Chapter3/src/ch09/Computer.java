package ch09;

public abstract class Computer {
	
	//�߻�Ŭ���� - �߻�޼��带 ������ �ִ� Ŭ����...new �� ���� �Ұ�.
	
	public abstract void display();
	public abstract void typing();
	
	
	//�������� �� �޼������ ���� 
	void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	void turnOff() {
		System.out.println("������ ���ϴ�.");
	}

}
