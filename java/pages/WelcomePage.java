package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.projectspecificmethod;

public class WelcomePage extends projectspecificmethod{
	public WelcomePage (ChromeDriver driver) {
		this.driver=driver;
	}
	public MyLeadsPage clickcrm() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyLeadsPage(driver);
	}
}

