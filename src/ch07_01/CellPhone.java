package ch07_01;

public class CellPhone {
	
	String model;
	String color;
	
	
	public CellPhone() {

	}
			
	public CellPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끊습니다.");
	}	
	void bell() {
		System.out.println("벨소리를 울립니다.");
	}	
	void hangOn() {
		System.out.println("전화를 켭니다.");
	}	
	void hangOff() {
		System.out.println("전화를 끊습니다.");
	}		
	
	
	
	


}
