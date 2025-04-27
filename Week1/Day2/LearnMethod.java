package week1.day2;

public class LearnMethod {
	
	//syntax: accessmodifiers/ returntype/ mthd name /input parameters
	
	public void add() {
		int a=3;
		int b=5;
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		//using object call the methods
	//syn:classname obj=new constructor();
		
		LearnMethod lm=new LearnMethod();
		lm.add();
	}

}
