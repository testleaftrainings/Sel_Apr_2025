package week1.day2;

public class LearnMethods {
	
	public void addNumber(int a,int b,float c){
		System.out.println(a+b+c);
		
	}
	
	private int noOfBicycles(){
		return 4;
		
	}
	
	String bicycleData(String brandName,String brandColour){
		return brandName+ " \n"+ brandColour;
		
	}
	public static void main(String[] args) {
		LearnMethods LM=new LearnMethods();
		LM.addNumber(5, 8, 7.7f);
		int numBicy = LM.noOfBicycles();
		System.out.println(numBicy);
		System.out.println(LM.bicycleData("honda", "Activa"));
	}

}
