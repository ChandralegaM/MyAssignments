package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement text = driver.findElement(By.linkText("Conditions of Use & Sale"));
		
		Actions scrldown =new Actions(driver);
		
		scrldown.scrollToElement(text).perform();
		Thread.sleep(4000);
		System.out.println(text.getText());
		System.out.println(driver.getTitle());
		driver.close();
		
		
		
		
	}

}
