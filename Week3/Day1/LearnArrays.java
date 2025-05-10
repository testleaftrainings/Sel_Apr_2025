package week3.day1;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		/*
		 * Arrays--->collection of items of same datatype
		 * declarations:1)ArrayLiteral--->based on data
		 *              syn:datatype varname[]={values}
		 *              2)Array instantiation-->based on size
		 *              syn:DT obj[]=new DT(size)
		 */
		//Array LItearl
		int marks[]= {98,87,91,78,96};//index statrs from 0
		//length oh the array
		int arraylength = marks.length;
		System.out.println(arraylength);//length starts from 1
		//iterate all values
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		
		//sort an array
		Arrays.sort(marks);//78,87,91,96,98
		System.out.println(marks[2]);
		//max valu
		System.out.println(marks[arraylength-1]);
		
		//ArrayInstantiation
		
		int marks1[]=new int[4];//size:1(0),2(1),3(2),4(3),the default of int is 0

		marks1[0]=45;
		marks1[1]=76;
		System.out.println(marks1[1]);
		
		String learners[]=new String[3];//default value of string is null
		learners[0]="Aishwarya";
		learners[1]="sharmila";
		//learners[2]="prakash";
		System.out.println(learners[2]);
		
		
		

	}

}
