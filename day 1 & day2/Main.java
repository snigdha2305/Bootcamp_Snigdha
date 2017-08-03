class Automobile {

	public Automobile() {
		System.out.println("Class Automobile");
	}

	public Automobile(String model, int price) {
		System.out.println("Model " + model + " has price " + price);
	}

	public void brand() {
		System.out.println("Brand: Generic");
	}
	
}

class Car extends Automobile {

	int wheels = 4;
	int seats = 5;
	int maxSpeed = 80;
	
	public Car() {
		super("AB", 2000);
		System.out.println("Number of wheels=" + wheels);
		System.out.println("Class Car");
	}

	public void brand() {
		super.brand();
		System.out.println("Brand: Maruti");
	}

	public void totalPersons(int seats) {
		System.out.println("Total " + seats + " people can sit in the car");
	}

}

class Bus extends Automobile {

	int wheels = 8;
	int seats = 30;
	int maxSpeed = 120;

	 public Bus() {
		 super();
		 System.out.println("Number of wheels=" + wheels);
		 System.out.println("Class Bus");
	 }

	 public void brand() {
		 super.brand();
		 System.out.println("Brand: Volvo");
	 }

	 public void totalPersons(int seats, int wheels) {
		 System.out.println("Total " + seats + " people can sit in the bus as it has " + wheels + " wheels");
	 }
}

class FlyingCar extends Car {

	public FlyingCar() {
		super();
		System.out.println("This is a flying car");
	}

}

class SportsCar extends Car {

	public SportsCar() {
		System.out.println("This is a sports car");
	}
}

class Main {
	public static void main(String[] args) {
		int wheels;
		int seats;
		String brand;
		String model;
		String dealer;
		int price;

		Automobile a = new Automobile();
		a.brand();
		
		Car c = new Car();
		c.brand();
		c.totalPersons(c.wheels);

		Bus b = new Bus();
		b.brand();
		b.totalPersons(30, b.wheels);

		FlyingCar f = new FlyingCar();
		SportsCar s = new SportsCar();

	}
}