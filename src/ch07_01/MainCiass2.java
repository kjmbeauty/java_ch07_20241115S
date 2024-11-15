package ch07_01;

public class MainCiass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape shape = new Shape();
		Square square = new Square();
		Triangle triangle = new Triangle();
				
		shape = square;//대입성공
		//square = shape;//대입실패
		shape = triangle;		
				
		Shape shape2 = triangle;
		shape2.area();
		
		
		
		
		

	}

}
