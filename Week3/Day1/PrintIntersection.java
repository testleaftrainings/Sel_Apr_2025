package week3.day1;

public class PrintIntersection {

	public static void main(String[] args) {
		int num[]= {4,3,6,7};
		int num1[]= {5,4,6,8,9};
		
		for (int i = 0; i < num.length; i++) {
			
			for (int j = 0; j < num1.length; j++) {
				
				if (num[i]==num1[j]) {//4==5,4==4
					System.out.println(num[i]);
				}
				
			}
			
		}

	}

}
