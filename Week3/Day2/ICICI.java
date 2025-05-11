package week3.day2;

public class ICICI extends Hdfc {

	
	public void knowYourCustomer() {
		System.out.println("AADHAR1");
	}

	
	public void withDrawalLimit() {
		System.out.println("5000");
	}

	
	public void convertCurrency() {
		
		System.out.println("in dollars");
	}
	public static void main(String[] args) {
		ICICI ban=new ICICI();
		ban.convertCurrency();
	}

}
