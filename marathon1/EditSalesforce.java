package marathon1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditSalesforce extends BaseClassSalesforce{
	@BeforeTest
	public void sendValues() {
		filename="CreateOpportunity";
	}
	
	@Test(dataProvider = "Salesforce")
	public void editSales(String oppName,String closedDate,String stg,String desc ) {
		driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys(oppName,Keys.ENTER);
		driver.findElement(By.xpath("//a[@title='Salesforce Automation by Chandralega0']")).click();
		
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled']")).click();
		
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys(closedDate);
		
		driver.findElement(By.xpath("//span[@title='"+stg+"']")).click();
		
		driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value']//span)[5]")).click();
		driver.findElement(By.xpath("//span[@title='In progress']")).click();
		
		driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys(desc);
		
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String eopportunitytext = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println("Edit Opportunity Toast Messsage:"+eopportunitytext);
	

}
}
