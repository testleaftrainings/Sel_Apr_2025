package week4.day1;

public class LearnOverriding extends LearnMethodOverloading {
	//use inheritance
	
	public void add() {
		int a=6;
		int b=5;
		
		System.out.println(a+b);
	}
	public void add(int a,float c,int b) {
		System.out.println(a+b-c);
	}
	public static void main(String[] args) {
		LearnOverriding lor=new LearnOverriding();
		lor.add(8, 7.7f, 6);
	}

}
