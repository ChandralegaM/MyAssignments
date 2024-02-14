package week3.day1;

public class BrowserSuperClass {
	
	String ss = "Browser";
	float rd =106.678f;
	
	public void openURL()
	{
		System.out.println("Open URL");
	}
	
	public void closeBrowser()
	{
		System.out.println("closeBrowser");
	}
	public void navigateBack()
	{
		System.out.println("go back to previous page");
	}
	public static void main(String[] args) {
		
		BrowserSuperClass gb = new BrowserSuperClass();
		gb.openURL();
		gb.closeBrowser();
		gb.navigateBack();
		
		
	
	
}
	}


