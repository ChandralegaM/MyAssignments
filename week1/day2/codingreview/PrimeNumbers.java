package week1.day2.codingreview;

public class PrimeNumbers {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		boolean flag= false;
		for (int i = 2; i <=num/2; i++) {
			if (num%i==0) {
				flag = true;
				break;
				
				
				
				
			} 
		}
		if(!flag)
			System.out.println("Prime number:"+num);
			else 
				System.out.println("Not a Prime number:"+num);
				
			}
}
			
		

	


