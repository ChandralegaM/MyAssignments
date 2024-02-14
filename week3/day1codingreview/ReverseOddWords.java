package week3.day1codingreview;

public class ReverseOddWords {

	public static void main(String[] args) {
		String test = "I am a software tester"; 
		
		String[] splitwords = test.split(" ");
		System.out.println("Splitted words:" +splitwords);
		int length = splitwords.length;
		//System.out.println(length);
		for (int i = 0; i <=splitwords.length-1; i++) {
			if (i%2==1) {
				char[] splitcharArray = splitwords[i].toCharArray();
				int length2 = splitcharArray.length;
				System.out.println(length2);
				//System.out.print(splitcharArray[i]);
				System.out.print(splitwords[i]+" ");
				}
			else
			{
				System.out.print(splitwords[i]+" ");
			}
			
			//char[] charSplit = splitwords[i].toCharArray();
			//for (int j = charSplit.length-1; j >=0; j--) {
				//System.out.print(charSplit[j]+" ");
			//}
			}
		
	
	}

}
