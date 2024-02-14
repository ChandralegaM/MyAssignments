package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//launch browser
		ChromeDriver driver = new ChromeDriver(); 
		
		//EdgeDriver driver = new EdgeDriver();
		//maximixe the window
		driver.manage().window().maximize();
		
		//load URl
		
		driver.get("https://myid.accenture.com");
		System.out.println("launched browser successfully");
		
		//java wait 
		
		Thread.sleep(4000);
		
		//close browser
		driver.close();
	} 

}
