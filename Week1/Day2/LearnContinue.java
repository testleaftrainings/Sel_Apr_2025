package week1.day2;

public class LearnContinue {

	public static void main(String[] args) {
		//print the numbers from 1 to  10 and when it finds the number it should skip the particular iteration
		for (int i = 1; i <=10; i++) {
			
			if (i==5) {
				continue;
			}
			System.out.println(i);
			
		}

	}

}
