package week6.day2codingreview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC001_W3Schools extends BaseClass{
	@BeforeTest
	public void sendvalues() {
		filename="Marks";
	}

	
	@Test (dataProvider="scdata")
	public  void wsc(String fname,String email,String adr,String city,String state,String zip,String cname,String ccnum
			,String expmonth,String cvv,String expyear) {
		System.out.println(fname);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(fname);
	
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		
		driver.findElement(By.xpath("//input[@id='adr']")).sendKeys(adr);
		
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);
		
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys(state);
		
		driver.findElement(By.xpath("//input[@id='zip']")).sendKeys(zip);
		
		driver.findElement(By.xpath("//input[@id='cname']")).sendKeys(cname);
		
		driver.findElement(By.xpath("//input[@id='ccnum']")).sendKeys(ccnum);
		
		driver.findElement(By.xpath("//input[@id='expmonth']")).sendKeys(expmonth);
		
		driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys(cvv);
		
		driver.findElement(By.xpath("//input[@id='expyear']")).sendKeys(expyear);

	}

}
