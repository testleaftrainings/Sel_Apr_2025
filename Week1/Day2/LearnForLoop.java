package week1.day2;

public class LearnForLoop {

	public static void main(String[] args) {

		//type for and do ctrl+space
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
			
		}
		System.out.println("---------------------");
		for (int i = 5; i>0; i--) {
			System.out.println(i);
			
		}
		LearnMethods l=new LearnMethods();
		System.out.println(l.bicycleData("suzuki", "red"));
	}

}
