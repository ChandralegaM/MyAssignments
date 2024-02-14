package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String companyName= "TestLeaf";
		
		char[] charArray = companyName.toCharArray();
		for (int i = charArray.length-1; i >=0 ; i--) {
			System.out.println("ReverseString:"+charArray[i]);
			
			
		}

	}

}
