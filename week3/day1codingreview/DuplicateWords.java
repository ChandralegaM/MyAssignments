package week3.day1codingreview;

public class DuplicateWords {

	public static void main(String[] args) {
		String duplicate = "We learn Java basics as part of java sessions in java week1"; 
		
		int count=0;
		String[] splitduplicate = duplicate.split(" ");
		System.out.println(splitduplicate);
		
		int length = splitduplicate.length;
		System.out.println(length);
		
		for (int i = 0; i <splitduplicate.length; i++) {
			for (int j = i+1; j <splitduplicate.length; j++) {
				if (splitduplicate[i].equalsIgnoreCase(splitduplicate[j])) {
					splitduplicate[j]="";
					count++;
					}		
				}
			}
		if (count>0) {
			for (int k = 0; k < splitduplicate.length; k++) {
				System.out.print(splitduplicate[k]+ " ");
	}
}
	}

}
