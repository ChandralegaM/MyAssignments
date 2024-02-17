package week1.day2;

import java.util.Arrays;
import java.util.Iterator;

import net.bytebuddy.description.annotation.AnnotationValue.Sort;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] mentors= {"Aravind", "Ragu", "Vinoth" , "Gokul","Subraja"};
		
		//To find the length of Array
		
		int length = mentors.length;
		System.out.println("Length of Array given :"+length);
		
		System.out.println("first name in array:"+mentors[0]);
		System.out.println("fourth name in array:"+mentors[3]);
		System.out.println("last name in array:"+mentors[length-1]);
		
		//Sorting
		
		//Arrays.sort(mentors);
		
		Arrays.sort(mentors);
	
	System.out.println("After sorted:"+mentors[3]);
	System.out.println("After sorted:"+mentors[2]);
	System.out.println("After sorted:"+mentors[1]);
	
	//for displaying names after sorting 
		
	for (int i = 0; i < mentors.length; i++) {
	System.out.println(mentors[i]);	
	}
	}
}


