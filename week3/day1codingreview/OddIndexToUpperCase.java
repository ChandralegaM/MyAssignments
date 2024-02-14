package week3.day1codingreview;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] charArray = test.toCharArray();
		for (int i = 0; i <=charArray.length-1; i++) {
			if (i%2==1) {
				//System.out.println(charArray[i]);
				char upperCase = Character.toUpperCase(charArray[i]);
				System.out.print(upperCase);
			}
			else
				System.out.print(charArray[i]);
		}

	}

}
