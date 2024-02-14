package week3.day2;

public abstract class CanaraBank implements Payments{
	
	public abstract void recordPaymentsDetails();
	
	
	public void kyc() {
		System.out.println("phonenumber");
	}
	public void cashOnDelivery() {
		System.out.println("yes");
	}
	public void cardPaymets() {
		System.out.println("credit");
	}
	public void internetBanking() {
		System.out.println("mode");
	}
		
	
	

}
