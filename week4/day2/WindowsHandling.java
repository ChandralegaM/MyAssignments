package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.irctc.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String parentWindow = driver.getTitle();
		System.out.println("Paarent Title:"+parentWindow);
		driver.findElement(By.xpath("(//li[@class='menu-list header-icon-menu']/a)[3]")).click();
		Set<String> wH1 = driver.getWindowHandles();
		System.out.println("Window id:"+wH1);
		
		List<String> checkWindow =new ArrayList<String>(wH1);
		
		driver.switchTo().window(checkWindow.get(1));
		System.out.println("current window:"+(driver.getTitle()));
		driver.switchTo().window(checkWindow.get(0));
		
		System.out.println("Paarent Title:"+parentWindow);
		driver.close();
		
		
		
	}

}
 