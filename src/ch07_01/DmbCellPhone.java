package ch07_01;

public class DmbCellPhone extends CellPhone{
	// 필드
	int channel;
	 
	 
	 
	public DmbCellPhone() {
		super();
			
		}	 
	 

	public DmbCellPhone(String model, String color, int channel) {
//		super();
//		this.model = model;
//		this.color = color;	
		super(model, color);		
		this.channel = channel;
	}

	
	// 메소드
	void turnOnDmb() {
		System.out.println("dmb 전원을 켭니다.");
	 }
	
	 void turnOffDmb() {
		System.out.println("dmb 전원을 켭니다.");
	 }	
	 void changchannel() {
		System.out.println("채널을 변경합니다.");
	 }	
	
	
	
	
	
	
	
	
	
	
	
	

}
