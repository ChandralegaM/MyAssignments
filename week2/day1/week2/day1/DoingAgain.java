package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class DoingAgain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		System.out.println("launched again");
		Thread.sleep(7000);
		driver.close();
		}

}
