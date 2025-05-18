package week4.day1;

public class LearnMethodOverloading {

	
	/*
	 * Method overloading:
	 *   the mthd signature is same but with different i/p args
	 *   and also diff datatypes---->static/compiletime/early binding
	 */
	
	public void add() {
		int a=1;
		int b=2;
		System.out.println(a+b);
	}
	public void add(int a,float c,int b) {
		System.out.println(a+b-c);
	}
	public void add(int a,int b,float c) {
		System.out.println(a+b+c);
		
	}
	public static void main(String[] args) {
		LearnMethodOverloading lo=new LearnMethodOverloading();
		lo.add();
		lo.add(5, 6.2f, 7);
	}
	
	
}
