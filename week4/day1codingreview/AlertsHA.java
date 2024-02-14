package week4.day1codingreview;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//button[@name='j_idt88:j_idt104']//span)[2]")).click();
		Thread.sleep(1000);
		Alert promt = driver.switchTo().alert();
		System.out.println(promt.getText());
		promt.sendKeys("Test Prompt Alert");
		Thread.sleep(1000);
		promt.dismiss();
		String text = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println("Prompt  Text :"+text);
		driver.close();
		
		
		
	}

}
