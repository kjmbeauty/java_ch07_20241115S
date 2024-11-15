package ch07_01;

public class Shape {
	
	int width;
	int heigth;	
	String color;
	
	public Shape() {
		
	}	
	
	
	
	public Shape(int width, int heigth) {
		super();
		this.width = width;
		this.heigth = heigth;
	}


	void area() {
		System.out.println(width*heigth);		
	}

	final void color() {
		System.out.println(color);		
	}
	
	
	
	
	
	
	

}
