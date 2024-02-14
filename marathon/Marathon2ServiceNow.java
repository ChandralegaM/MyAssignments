package marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class Marathon2ServiceNow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://dev209623.service-now.com/");
		
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("$Oq63s-IHcyA");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		Shadow all =new Shadow(driver);
		all.setImplicitWait(20);
		all.findElementByXPath("//div[text()='All']").click();
		//all.findElementByXPath("//input[@id='filter']").sendKeys("Service Catalog");
		all.findElementByXPath("//span[text()='Service Catalog']").click();
		all.setImplicitWait(20);
		WebElement mobiles = all.findElementByXPath("//iframe[@id='gsft_main']");
		all.setImplicitWait(20);
		driver.switchTo().frame(mobiles);
		all.setImplicitWait(20);
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13 pro']")).click();
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
		driver.findElement(By.xpath("//input[@class='cat_item_option sc-content-pad form-control']")).sendKeys("99");
		driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']")).click();
		driver.findElement(By.xpath("//option[@value='unlimited']")).click();
		driver.findElement(By.xpath("//label[text()='Sierra Blue']")).click();
		driver.findElement(By.xpath("//label[text()='512 GB [add $300.00]']")).click();
		all.setImplicitWait(20);
		WebElement orderNow = driver.findElement(By.xpath("//button[@class='request_catalog_button_with_icon btn cat-btn btn-primary']"));
		all.setImplicitWait(20);
		Actions act =new Actions(driver);
		act.scrollToElement(orderNow).perform();
		orderNow.click();
		String reqNumber = driver.findElement(By.xpath("(//a[@class='linked requestItemUrl'])[1]")).getText();
		System.out.println("The Request Number for Mobile Order is :"+reqNumber);
		
		File Snap = driver.getScreenshotAs(OutputType.FILE);
		File save =new File("./snapshot.mobileorderrequest/png");
		FileUtils.copyFile(Snap, save);
		
		
		
		
		
		
	
		
		
		
	}

}
