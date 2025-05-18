package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
	
	public static void main(String[] args) {
		//syn:interface <wrapperclass> listname=new implementationclass<wrapperclass>();
		
		List<String> learners=new ArrayList<String>();
		
		List<String> trainer=new ArrayList<String>();
		trainer.add("saranya");
		System.out.println(trainer);
		//add names to the list
		learners.add("kavitha");
		System.out.println(learners);
		learners.add("rex");
		learners.add("joseph");
		System.out.println(learners);
		
		//use index
		learners.add(1, "Ajithkumar");
		//iterate the values
		for (int i = 0; i < learners.size(); i++) {
			System.out.println(learners.get(i));
		}
		//size
		int size = learners.size();
		System.out.println(size);
		//retreive a single value
		System.out.println(learners.get(1));
		//remove a particular value
		String remove = learners.remove(1);
		System.out.println(learners);
		//clear the list
		//learners.clear();
		//System.out.println(learners);
		trainer.addAll(learners);
		System.out.println(trainer);
		
		
	}

}
