package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser eb = new Browser();
		eb.loadUrl();
		eb.launchBrowser("browserName");
		
}
}

