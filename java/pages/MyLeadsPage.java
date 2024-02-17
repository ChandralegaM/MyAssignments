package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.projectspecificmethod;

public class MyLeadsPage extends projectspecificmethod{
	public MyLeadsPage (ChromeDriver driver) {
		this.driver=driver;
	}
	public MyLeadsPage clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return this;
		}
	public CreateLeadPage clickCLeads() {
		driver.findElement(By.linkText(" Lead")).click();
		return new CreateLeadPage(driver);
		}
}
