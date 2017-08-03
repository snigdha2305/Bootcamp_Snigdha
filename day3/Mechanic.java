abstract class Vehicle {

	public Vehicle() {
		System.out.println("Class Vehicle");
	}
	
	
	public void details(int vin, String name, int speed, int price) {
		System.out.println("Vin :" + vin);
		System.out.println("Name : " + name);
		System.out.println("Speed : " + speed);
		System.out.println("Price : " + price);
	}

	abstract void drive();

	abstract void inspect();
}

class Car extends Vehicle {

	public Car() {
		System.out.println("Class Car");
	}

	void drive() {
		System.out.println("Driving Car");
	}

	void inspect() {
		System.out.println("Inspecting Car");
	}

}

class Bike extends Vehicle {

	public Bike() {
		System.out.println("Class Bike");
	}

	void drive() {
		System.out.println("Driving Bus");
	}

	void inspect() {
		System.out.println("Inspecting Bus");
	}

}

class Mechanic {
	public static void main(String[] args) {
		int vin, speed, price;
		String name;

		Car c = new Car();
		c.details(123, "Maruti", 80, 350000);
		c.drive();
		c.inspect();
		
		Bike b = new Bike();
		b.details(234, "Splender", 60, 260000);
		b.drive();
		b.inspect();
	}
} 