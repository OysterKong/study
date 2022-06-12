package ch09;

public abstract class Computer {
	
	//추상클래스 - 추상메서드를 가지고 있는 클래스...new 로 생성 불가.
	
	public abstract void display();
	public abstract void typing();
	
	
	//공통으로 쓸 메서드들을 구성 
	void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void turnOff() {
		System.out.println("전원을 끕니다.");
	}

}
