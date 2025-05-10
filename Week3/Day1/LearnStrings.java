package week3.day1;

public class LearnStrings {

	public static void main(String[] args) {
		/*
		 * String--->collection of characters
		 * Declarations-->1)String literal
		 * 	               2)String Instantiation
		 */
		//string literal:syn:Datatype varName="values";
		
		String name="Testleaf";
		String name1="TestLeaf";
		
		//String object
		
		String str=new String("Testleaf");//index statrs 0
		String str1=new String("Testleaf");
		
		//count the no of characters
		//int length = name1.length();
		System.out.println(name1.length());
		
		//concatenation
		String s=" welcome";
		String s1=" to testleaf";
		String s2=" for selenium course";
		//System.out.println(s+s1);
		System.out.println(s.concat(s1).concat(s2));
		//Equals(compare the strings)--->compares the content of the string and case sensitive
		boolean equals = str.equals(name1);
		System.out.println(equals);
		
		if (str.equals(name1)) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		
		//(==)---->check for the memory location
		if (name==name1) {
			System.out.println("address same");
		} else {
			System.out.println("address not same");
		}
		//ignore casesensitive
		boolean equalsIgnoreCase = str.equalsIgnoreCase(name1);
		System.out.println(equalsIgnoreCase);
		//contains-->case sensitive
		if (str1.contains("Testleaf")) {
			System.out.println("present");
		} else {
			System.out.println("not present");

		}
		
		//toCharArray
		char[] charArray = name.toCharArray();
		//System.out.println(charArray);
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
			
		}
		
		//CharAt--->retreive a character using the index
		char charAt = str.charAt(4);
		System.out.println(charAt);
		//replace
		
		String rep="Bac@321";
		String replace = rep.replace("abc", "123");
		System.out.println(replace);
		
		//retrieve the values
		String replaceAll = rep.replaceAll("[^A-z]", "");
		System.out.println(replaceAll);
		 String replaceAll2 = rep.replaceAll("[^0-9]", "");
		 System.out.println(replaceAll2 );
		 
		 //String to integer
		 String st="1234";
		 System.out.println(st+10);
		 int stringtoint = Integer.parseInt(st);
		 System.out.println(stringtoint+10);
		 //integer to string
		 int i=123;
		 System.out.println(i+10);
		 String string = Integer.toString(i);
		 System.out.println(string+10);
		 
		 //split--->as string into multiple strings
		 String st1="Testleaf and Qeagle";
		 String[] split = st1.split("le");
		 System.out.println(split[0]);
		 
		 String[] split2 = st1.split(" ");//testleaf(0) and(1) qeagle(2)
		 System.out.println(split2[2]);
		 
		 String[] split3 = st1.split("");//"t""e"
		 System.out.println(split3[12]);
		 
		 //substring
		 String ss="April";
		 String substring = ss.substring(2);
		 System.out.println(substring );
		 String substring2 = ss.substring(1, 3);
		 System.out.println(substring2);
		
		
		
		
		
		
		
	}

}
