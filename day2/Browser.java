package week1.day2;

public class Browser {
	
	public String launchBrowser(String browserName) {
	System.out.println("Browser launched successfully");
	return browserName;
	}
	public void loadUrl()
	{
		System.out.println("Application url laded successfully");
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser mo = new Browser();
		mo.loadUrl();
		mo.launchBrowser("browserName");
	}

}
	
