package week3.day2;

public class Car extends Vehicle {
	public void applyGear() {
		System.out.println("gear is applied--->subclass");
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.applyGear();
		c.applyBreak();
		c.soundHorn();
		
	}

}
