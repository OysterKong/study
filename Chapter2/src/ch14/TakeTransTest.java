package ch14;

public class TakeTransTest {

	public static void main(String[] args) {
		
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		
		studentJames.takeBus(bus100);
		
		Subway greenSubway = new Subway(2);
		studentTomas.takeSubway(greenSubway);
		
		studentJames.showInfo();
		studentTomas.showInfo();
		
		bus100.showBusInfo();
		greenSubway.showBusInfo();
		
		bus500.showBusInfo();

	}

}
