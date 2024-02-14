package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.switchTo().alert().accept();
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println("print the text:"+text);
		
		
		
		
	}

}
