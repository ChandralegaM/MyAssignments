package week3.day1codingreview;

public class IHTDSubclass1 extends IHTestDataSuperClass{

	public void enterUsername() {
		System.out.println("Enter Username");
		
	}
	public void enterPassword() {
		System.out.println("Enter Password");
		
	}
	public static void main(String[] args){
		IHTDSubclass1 sub1 =new IHTDSubclass1();
		sub1.enterCredentials();
		sub1.navigateToHomePage();
		sub1.enterPassword();
		sub1.enterUsername();
	}
	}

