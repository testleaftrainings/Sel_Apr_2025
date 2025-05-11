package week3.day2;

public class BMW extends Car{
	
	public void turnONAc() {
		System.out.println("AC is turned on--->bmw class");
	}
	public void voiceCommand() {
		System.out.println("voice cmd is enabled--->bmw class");
	}
	public static void main(String[] args) {
		BMW b=new BMW();
		b.applyBreak();
		b.applyGear();
		b.turnONAc();
	}

}
