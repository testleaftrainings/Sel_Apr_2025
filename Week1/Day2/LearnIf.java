package week1.day2;

public class LearnIf {

	public static void main(String[] args) {
		int marks=60;
		//type if and do ctrl+space
		if (marks<=60) {
			System.out.println("pass");
			
		}
		
		if (marks<60) {
			System.out.println("pass");
			
		} else {
			System.out.println("fail");

		}
		
		int marks1=50;
		if (marks1>=90) {
			System.out.println("distinction");
			
		}else if(marks1<=40) {
			System.out.println("grade A");
			
		}
		else if(marks1==60) {
			System.out.println("grade B");
			
		}
		else {
			System.out.println("fail");
		}
	}

}
