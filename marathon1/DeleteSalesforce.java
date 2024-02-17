package marathon1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DeleteSalesforce extends BaseClassSalesforce {
	@BeforeTest
	public void sendValues() {
		filename="CreateOpportunity";
	}
	
	@Test(dataProvider = "Salesforce")
	public void deleteSales(String oppName ) {
		driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys(oppName,Keys.ENTER);
		driver.findElement(By.xpath("//a[@title='Salesforce Automation by Chandralega0']")).click();
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled']")).click();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//button[@title='Delete']")).click();
		String dopportunitytext = driver.findElement(By.xpath("//div[@class='slds-theme--success slds-notify--toast slds-notify slds-notify--toast forceToastMessage']")).getText();
		System.out.println("Delete Opportunity Toast Messsage:"+dopportunitytext);
		
		
	}
	
	
}
