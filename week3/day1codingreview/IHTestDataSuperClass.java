package week3.day1codingreview;

public class IHTestDataSuperClass {

	public void enterCredentials() {
		System.out.println("Enter UsernamePassword");
		
	}
	public void navigateToHomePage() {
		System.out.println("Navigate to Home");
		
	}
	
	public static void main(String[] args) {
		IHTestDataSuperClass sup =new IHTestDataSuperClass();
		sup.enterCredentials();
		sup.navigateToHomePage();
		
	}
}
