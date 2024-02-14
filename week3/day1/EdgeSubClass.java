package week3.day1;

public class EdgeSubClass extends ChromeSubClass {
	public void takeSnap()
	{
		System.out.println("Take the snap");
	}
	public void openURL()
	{
		System.out.println("in edge Open URL");
	}
	public void clearCookies()
	{
		System.out.println("clear the Cookies");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeSubClass es =new EdgeSubClass();
		es.clearCookies();
		es.takeSnap();
		es.closeBrowser();
		es.clearCache();
		es.openURL();
		
	}

}
