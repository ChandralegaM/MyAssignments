package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.projectspecificmethod;

public class CreateLeadPage extends projectspecificmethod{
	
	public CreateLeadPage (ChromeDriver driver) {
		this.driver=driver;
	}
	
	public CreateLeadPage enterCName(String CompanyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CompanyName);
		return this;
		}
	
	public CreateLeadPage enterFName(String FirstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);
		return this;
	}
	public CreateLeadPage enterLName(String LastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LastName);
		return this;
	}
	public CreateLeadPage enterPhNo(String Phno) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(Phno);
		return this;
	}
	public ViewLeadPage clickCLSubmit() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
	
	
	
}
