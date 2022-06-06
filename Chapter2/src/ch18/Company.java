package ch18;

public class Company {
	
	//�ϳ��� �ν��Ͻ�, ������ �ν��Ͻ�
	private static Company instance = new Company();
	
	//�ܺο��� �����ڸ� ������� �������� ���ϵ��� private���� �ϳ� ����
	private Company() {
		
	}
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
	
}
