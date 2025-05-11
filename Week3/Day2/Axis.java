package week3.day2;

public class Axis implements RBI{

	
	public void knowYourCustomer() {
		
		System.out.println("pancard");
	}

	
	public void withDrawalLimit() {
		
		System.out.println("10000");
	}
	public void housingLoan() {
		System.out.println("10%");
	}
	public static void main(String[] args) {
		Axis A=new Axis();
		A.knowYourCustomer();
	}

}
