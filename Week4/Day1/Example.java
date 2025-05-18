package week4.day1;

public class Example extends LearnMethodOverloading {
	public void add() {
		int a=10;
		int b=20;
		int c=30;
		System.out.println(a+b+c);
	}
	public void add(int a,int b,String name) {
		System.out.println(a+b+name);
		
	}
	public void add(int a,float c) {
		System.out.println(a+c);
	}
	public static void main(String[] args) {
		Example e=new Example();
		e.add();
	}
}
