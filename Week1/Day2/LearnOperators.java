package week1.day2;

public class LearnOperators {

	public static void main(String[] args) {
		//arithmetic operators
		System.out.println(3+6);
		System.out.println(4/2);
		System.out.println(11%2);
		//assignment
		int a=6,b=5;
		a+=4;//a=a+4---->10
		System.out.println(a);
		b-=3;//b=b-3--->2
		System.out.println(b);
		b*=2;//b-=b*2-->2*2		
		System.out.println(b);
		
		//comparison operators
		System.out.println(4>=5);
		//logical operators
		System.out.println((5==5)&&(7==7));//1*1--->1--->true
		System.out.println((5==2)||(3>2));//0+1--->1-->true
		
		//unary operators
		int x=1;
		System.out.println(x++);//2
		//System.out.println(x++);//2,x+1
		//System.out.println(x);//3
		System.out.println(x);

	}

}
