package week3.day2;

public class Auto extends Vehicle {
	public void applyMeter() {
		System.out.println("meter is applied--->auto class");
	}
	public static void main(String[] args) {
		Auto a=new Auto();
		a.applyBreak();
		a.applyMeter();
	}

}
