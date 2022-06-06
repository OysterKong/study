package ch15;

public class Person {
	
	String passengerName;
	int money;
	
	public Person(String passengerName, int money) {
		this.passengerName = passengerName;
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	public void passengerInfo() {
		System.out.println(passengerName + "님의 남은 돈은 "+ money + "원 입니다." );
	}
	
	

}
