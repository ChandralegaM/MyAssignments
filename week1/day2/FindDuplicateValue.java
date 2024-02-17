package week1.day2;

import java.util.Arrays;
import java.util.Iterator;

public class FindDuplicateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []age= {23,45,12,56,45,32,66,34,12};
		
		//outer forloop
		
		for (int i = 0; i < age.length; i++) {
		//inner forloop
			
		for (int j = i+1; j < age.length; j++) { 
			
		 if (age[i]==age[j]) {
			 System.out.println("duplicate age"+age[j]);
		 }
		}
		}
	
		System.out.println("*******************************");
	 
	//Sorting
		Arrays.sort(age);
		for (int i= 0; i< age.length-1; i++) {
			if (age[i]==age[i+1]) {
			System.out.println("duplicate values:"+age[i+1]);	
	
			
		}
	}
		
			
}}


