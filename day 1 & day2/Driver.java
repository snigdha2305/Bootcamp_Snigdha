class Driver {
	public static void main(String[] args) {
		String name;
		int age;
		String licenseNumber;
		Car car1 = new Car();
		car1.start(50);
		car1.speed = 50;
		car1.accelerate();
		car1.brake();
	}
}