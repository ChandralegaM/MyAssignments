package week2.day2codingreview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LGReadiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(30));
		driver.get("https://www.leafground.com/radio.xhtml");
		Thread.sleep(4000);
		//where to inspect if it is for radio button , checkbox
		
		driver.findElement(By.xpath("//label[text()='Chrome'][1]")).click();
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		
		boolean radio = driver.findElement(By.xpath("//label[text()='Chennai']")).isSelected();
		if (radio==true) {
			System.out.println("Button is selected");
		} else {
			System.out.println("Button is not selected");
		}
		
		//confused ask doubt
		boolean browser1 = driver.findElement(By.xpath("//label[text()='Safari'][2]")).isSelected();
		System.out.println("seleceted by default:"+browser1);
		boolean years = driver.findElement(By.xpath("//label[text()='21-40 Years']")).isEnabled();
		System.out.println("isEnabled:"+years);
		
		
	}

}
