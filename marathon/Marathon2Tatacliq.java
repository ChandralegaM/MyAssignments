package marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Marathon2Tatacliq {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//To Disable Browser notification
		ChromeOptions op =new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		ChromeDriver driver =new ChromeDriver(op);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.tatacliq.com/");
		
		//To click sweet Alert in tatacliq page
		//driver.findElement(By.xpath("//button[@id='wzrk-confirm']")).click();
				
		//To Mouse over on Brands
		WebElement brands = driver.findElement(By.xpath("//div[text()='Brands']"));
		Actions tatacliq =new Actions(driver);
		tatacliq.moveToElement(brands).perform();
		Thread.sleep(1000);
		
		//To MouseHover on 'Watches & Accessories'
		WebElement wataccess = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		tatacliq.moveToElement(wataccess).perform();
		Thread.sleep(1000);
		
		//To Choose the first option from the 'Featured brands'
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		
		//To Select sortby: New Arrivals
		
		WebElement sortBy = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		Select newArrival =new Select(sortBy);
		newArrival.selectByValue("isProductNew");
		
		//To choose men from catagories filter.
		driver.findElement(By.xpath("(//div[@class='FilterDesktop__newFilCheckbox']/div)[1]")).click();
		
		//To print all price of watches
		
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));
		//int size = price.size();
		//System.out.println("Total Price List:"+size);
		for (int i = 0; i <= 15; i++) {
		System.out.println(price.get(i).getText());
			
		//}
		
		//Set<WebElement> data =new LinkedHashSet<WebElement>(price);
		//for (WebElement allprice : data) {
			//String allpricetext = allprice.getText();
			//int pricetext = Integer.parseInt(allpricetext);
		//System.out.println(allpricetext);
		
		}
		//To get price 
		WebElement casioprice = driver.findElement(By.xpath("(//div[@class='ProductDescription__priceHolder']/h3[@class='ProductDescription__boldText'])[1]"));
		casioprice.getText();
		//To click on the first resulting watch.
		
		driver.findElement(By.xpath("(//a[@title='Casio A1000MCG-9EF Vintage Series Digital Watch for Unisex-Casio-Watches-TATA CLIQ']/div)[2]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("Window id:"+windowHandles);
		
		List<String> checkWindow =new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(checkWindow.get(1));
		
		//To compare two price are similar
		WebElement casioprice1 = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']"));
		casioprice1.getText();
		
		if (casioprice==casioprice1) {
			System.out.println("Print Same");
		} else {
			System.out.println("Print different");
		}
		
		//To click Add to Bag and get count from the cart icon
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		String bagCount = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		
		System.out.println("Count of Bag:"+bagCount);
		
		//To Click on the cart
		
		//Take a snap of the resulting page. 
		File shoe = driver.getScreenshotAs(OutputType.FILE);
		File screenshot =new File("./snapshot/shoescreenshot.png");
		FileUtils.copyFile(shoe, screenshot);
	
		//To close All the opened windows one by one.
		String currentWindow = driver.getTitle();
		System.out.println("Current window:"+currentWindow);
		
		driver.close();
		
		driver.switchTo().window(checkWindow.get(0));
		
		String defparentWindow = driver.getTitle();
		System.out.println("default Parent window:"+defparentWindow);
		
		driver.close();
		
	}

}
