package week7.day2;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		
		int x=4;
		int y=0;
		int num[]= {1,3,4,5};
		try {
			System.out.println(x/y);
			
		} catch (ArithmeticException e) {
			System.out.println(e);
			
		}
		try {
			
			System.out.println(num[4]);
		}
		catch (Exception e) {
			System.out.println(e);
			
		}
		System.out.println("completed");

	}

}
