class Circle {
	
	void paint(int pencilSize) {
		System.out.println("Pencil Painting");
	}

	void paint(int brushSize, String brushColour) {
		System.out.println("Brush Painting");
	}

	void paint(int fingers, int radius) {
		System.out.println("Hand Painting");

	}	

	public static void main(String[] args) {
		Circle c = new Circle();
		c.paint(2);
		c.paint(2, "Red");
		c.paint(2,3);
	}
}