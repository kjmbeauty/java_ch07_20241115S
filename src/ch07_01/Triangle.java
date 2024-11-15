package ch07_01;

public class Triangle  extends Shape{
	
	String style;
	
	public Triangle() {

	}	

	public Triangle(int width, int heigth) {
		super(width, heigth);
		// TODO Auto-generated constructor stub
	}

	@Override  //annotation
	void area() {
		// TODO Auto-generated method stub
		System.out.println(width*heigth*0.5);			
		
	

		
		

	}
	
	
	
	
	
	
	
	

}
