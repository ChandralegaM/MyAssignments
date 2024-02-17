package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpaths {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Tuna@321");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.xpath("//a[text()='Find your account and log in.']")).click();
		Thread.sleep(6000);
		driver.close();
		
	}
 
}


//div[@class='cartInner']//i = GP to child

//1:https://www.snapdeal.com/
	  // cart -xpath == //div[@class='cartInner']//i = GP to child
	  /// footwear- xpath  === (//a[@class='brandLabelFooter']/parent::ul[@class='footerSubCategoriesUl'])[3]
	// 2.https://www.amazon.in/
	// Best sellers  == //span[@class='nav-a-content']/parent::a[@aria-label='Bestsellers']