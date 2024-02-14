package week4.day1codingreview;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert tryit = driver.switchTo().alert();
		System.out.println("Message in Alert Window:"+tryit.getText());
		tryit.accept();
		String ok = driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
		System.out.println("After Handling Alert:"+ok);
		
		
		
		
		
	}
}
