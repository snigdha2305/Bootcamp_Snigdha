class MyCompany {

	@Company(name = "CDK", location = "Pune")

	void show() {
	
		System.out.println("Welcome to CDK, Pune");
	}
	
	public static void main(String args[]) {
		
		MyCompany mc = new MyCompany();
		mc.show();
	}
}
