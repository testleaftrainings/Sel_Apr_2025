package week4.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintUnique {

	public static void main(String[] args) {
		
		String s="Hello";
		char[] charArray = s.toCharArray();
		
		//syn:Interface <generic name> setname=new imp.class<generic name>();
		Set<Character> unique=new TreeSet<Character>();
		Set<Character> duplicates=new TreeSet<Character>();
		
		
		for (int i = 0; i < charArray.length; i++) {
			
			boolean b = unique.add(charArray[i]);
			
			if (!b) {
				duplicates.add(charArray[i]);
			}
			
		}
		System.out.println("unique elements are:"+unique);
		System.out.println("dups are:"+duplicates);
	}

}
