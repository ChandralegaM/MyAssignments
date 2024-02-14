package week2.day1codingreview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Chandralega");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement iedd = driver.findElement(By.name("industryEnumId"));
		Select iedd1 =new Select(iedd);
		iedd1.selectByVisibleText("Computer Software");
		
		WebElement odd = driver.findElement(By.name("ownershipEnumId"));
		Select odd1 =new Select(odd);
		odd1.selectByVisibleText("S-Corporation");
		
		WebElement dsdd = driver.findElement(By.name("dataSourceId"));
		Select dsdd1 =new Select(dsdd);
		dsdd1.selectByVisibleText("Employee");
		
		WebElement mcdd = driver.findElement(By.name("marketingCampaignId"));
		Select mcdd1 =new Select(mcdd);
		mcdd1.selectByVisibleText("eCommerce Site Internal Campaign");
		
		WebElement gsdd = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select gsdd1 =new Select(gsdd);
		gsdd1.selectByVisibleText("Texas");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		 
		 
		 
		
	}
	
}

