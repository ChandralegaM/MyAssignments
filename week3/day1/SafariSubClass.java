package week3.day1;

public class SafariSubClass extends EdgeSubClass{
	public void readerMode()
	{
		System.out.println("Open readerMode");
	}
	
	
	public void fullScreenMode()
	{
		System.out.println("do fullScreenMode");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SafariSubClass ss =new SafariSubClass();
		ss.fullScreenMode();
		ss.readerMode();
		ss.clearCache();
		ss.closeBrowser();
		ss.openURL();
		ss.takeSnap();
	}

}
