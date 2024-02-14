package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']/span[2]")).click();
		org.openqa.selenium.Alert alert1 = driver.switchTo().alert();
		alert1.sendKeys("test");
		alert1.accept();
		String text = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(text);
	
		
		
		
	}

}
