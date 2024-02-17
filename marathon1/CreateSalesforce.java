package marathon1;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateSalesforce extends BaseClassSalesforce{
@BeforeTest
	public void sendValues() {
	filename="CreateOpportunity";
	}	
	
	@Test(dataProvider = "Salesforce")
	public void createSales(String oppName,String amount,String closedDate,String stg) {
	
		driver.findElement(By.xpath("//a[@title='New']")).click();
		driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input")).sendKeys(oppName);
		
		//to get text and store the values --using attribute get code from Vinoth
		
		
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys(amount);
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys(closedDate);
		
		driver.findElement(By.xpath("//span[@title='"+stg+"']")).click();
		
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String copportunitytext = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println("Create Opportunity Toast Messsage:"+copportunitytext);
		
		
		
	}
	
	
	

}
