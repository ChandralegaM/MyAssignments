package week6.day2;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TCR001_CreateLead extends BaseClass{
	@BeforeTest
	public void setValues()
	{
		fileName ="CreateLead";
	}
	
	
@Test(dataProvider="datas",priority= -1)
	public void createLead(String cName, String fName, String lName,String phNo) {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("TestLeaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		


	}

}
													