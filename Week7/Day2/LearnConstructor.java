package week7.day2;

public class LearnConstructor {
	/*
	 * Constructor:
	 * -used to initialize the state  of the objects
	 * -constru name shld be same as that of class name
	 * -diff b/w mthd and constructor is---that return type is not there in constructor
	 * types:
	 * 1)default constructor(with no args)
	 * 2)parameterized constructor(args)---->constructor overloading
	 * 
	 * this:used to differentiate b/w the local and global variables if it has the same name nside te class.
	 * constructor chaining:calling one constructor fron another constructor.
	 * 
	 */
	
	int empId;
	String empName;
	boolean empStatus;
	
	public LearnConstructor() {
		//this(68, "saranya", true);
		//empId=98;
		System.out.println("default constructor");
		
	}
	public LearnConstructor(int empId ,String empName,boolean empStatus) {
		this();
		this.empId=empId;
		this.empName=empName;
		this.empStatus=empStatus;
		
		
		System.out.println("Parameterized  constructor");
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		  LearnConstructor lc1=new LearnConstructor(65, "saran", false);
		  System.out.println(lc1.empId+" "+lc1.empName+" "+lc1.empStatus);
		 
		
		/*
		 * LearnConstructor lc=new LearnConstructor();
		 * System.out.println(lc.empId+" "+lc.empName+" "+lc.empStatus);
		 */
		
	}

}
