package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Phone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Phone");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		List<WebElement> price = driver.findElements(By.className("a-price-whole"));
		int size = price.size();
		System.out.println("Need to know size of price:"+size);
		
		List <Integer> price1 =new ArrayList<Integer>();
		for (WebElement data : price) {
			String text = data.getText();
			String replaceAll = text.replaceAll(",", "");
			int mobileprice = Integer.parseInt(replaceAll);
			//price1.add(text);
			price1.add(mobileprice);
		}
		
		Collections.sort(price1);
		System.out.println(price1);
	}

}

