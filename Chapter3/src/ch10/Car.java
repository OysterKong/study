package ch10;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {
		//구현은 했고 AICar 에서는 재정의를 했고 ManualCar 에서는 재정의를 안했으므로 결과에는 한쪽만 실행
	}
	
	
	//차량 운행하는데는 순서가 변하면 안되므로 final 로 막아두기.
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
	
}
