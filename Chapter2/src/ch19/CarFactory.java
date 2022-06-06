package ch19;


public class CarFactory {

	private static CarFactory instance = new CarFactory();
	
	
	private CarFactory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	public Car createCar() {
		Car car = new Car();
		return car;
	}

}
