package week2.day1codingreview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		System.out.println("chrome launched successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Chandralega");
		driver.findElement(By.name("lastname")).sendKeys("Mayagopalan");
		driver.findElement(By.name("reg_email__")).sendKeys("9629334876");
		driver.findElement(By.id("password_step_input")).sendKeys("Test@123");
		WebElement daydd = driver.findElement(By.id("day"));
		Select day =new Select(daydd);
		day.selectByValue("6");
		WebElement monthdd = driver.findElement(By.id("month"));
		Select month =new Select(monthdd);
		month.selectByVisibleText("Mar");
		WebElement yeardd = driver.findElement(By.id("year"));
		Select year =new Select(yeardd);
		year.selectByVisibleText("2002");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.name("websubmit")).click();
		System.out.println("Creted User successfully");
		Thread.sleep(4000);
		//driver.close();
		
		
				
		
	}

}
