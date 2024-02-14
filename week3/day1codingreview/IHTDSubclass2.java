package week3.day1codingreview;

public class IHTDSubclass2 extends IHTDSubclass1 {
	
	public void check() {
		System.out.println("chekced");
		
	}
	public void url() {
		System.out.println("url opened");
		
	}
	public static void main(String[] args){
		IHTDSubclass2 sub2 =new IHTDSubclass2();
		sub2.enterCredentials();
		sub2.navigateToHomePage();
		sub2.enterPassword();
		sub2.enterUsername();
		sub2.check();
		sub2.url();
		
		
		
	}
	}