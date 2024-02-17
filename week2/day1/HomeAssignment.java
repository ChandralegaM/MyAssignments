package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("IT Company");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Chandralega");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mayagopalan");
		
		
		
		WebElement sourceOption = driver.findElement(By.id("createLeadForm_dataSourceId"));
		sourceOption.click();
		
		//Source dropdown= new Source(sourceOption);
		Select dropdown1=new Select(sourceOption);
		dropdown1.selectByIndex(4);
		
		WebElement marCamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		marCamp.click();
		Select dropdown2=new Select(marCamp);
		dropdown2.selectByVisibleText("Automobile");
		
		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		ownership.click();
		Select dropdown3= new Select(ownership);
		dropdown3.selectByValue("OWN_CCORP");
		System.out.println("Get Title:"+driver.getTitle());
		
		Thread.sleep(7000);
		driver.close();
		
		
		
		
	}

}
