package week3.day1;

public class ChromeSubClass extends BrowserSuperClass{

	public void openIncognito()
	{
		System.out.println("Open Incognito");
	}
	
	public void clearCache()
	{
		System.out.println("do clearCache");
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		ChromeSubClass cs =new ChromeSubClass();
		cs.clearCache();
		cs.openIncognito();
		cs.closeBrowser();
		cs.navigateBack();
		cs.openURL();
	}

}
