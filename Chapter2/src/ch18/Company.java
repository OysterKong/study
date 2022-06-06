package ch18;

public class Company {
	
	//하나의 인스턴스, 유일한 인스턴스
	private static Company instance = new Company();
	
	//외부에서 생성자를 마음대로 생성하지 못하도록 private으로 하나 제공
	private Company() {
		
	}
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
	
}
