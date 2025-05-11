package week3.day2;

public class SBI extends Axis implements RBI,Inter {

	public void knowYourCustomer() {
		System.out.println("AADHAR");
		
	}

	public void withDrawalLimit() {
		
		System.out.println("20,000");
	}
	
	public void goldLoan() {
		System.out.println("8%");
	}
	public static void main(String[] args) {
		SBI bank=new SBI();
		bank.knowYourCustomer();
		bank.goldLoan();
		bank.housingLoan();
		bank.systemDesign();
	}

	
	public void systemDesign() {
		System.out.println("dsign is in process");
		
	}

}
