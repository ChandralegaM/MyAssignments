package week1.day2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumClass{

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
}