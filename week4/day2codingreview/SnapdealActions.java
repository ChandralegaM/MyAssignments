package week4.day2codingreview;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
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

public class SnapdealActions {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/");
		
		ChromeOptions op =new ChromeOptions();
		op.addArguments("--disable-noification");
		//how to remove that notification or no need 
		
		//To Go to "Men's Fashion". 
		Actions snapdeal =new Actions(driver);
		WebElement mensFashion = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		snapdeal.moveToElement(mensFashion).perform();
		
		// Go to "Sports Shoes". 
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		
		//To Get the count of sports shoes. 
		String sportsSC = driver.findElement(By.xpath("//div[text()='Sports Shoes for Men']/following-sibling::div")).getText();
		System.out.println("the count of sports shoes :"+sportsSC);
		
		//To Click on "Training Shoes". 
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		
		//To Sort the products by "Low to High".
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();
		
		//how To Check if the displayed items are sorted correctly.-- need to as vineeth error in add asking to change addall
		List<WebElement> priceTS = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		
		
		Set<WebElement> priceTS1 =new LinkedHashSet<WebElement>(priceTS);
		Thread.sleep(3000);
		for (WebElement dataTS : priceTS1) {
			String textTS = dataTS.getText();
			//String replaceAll = textTS.replaceAll(",", "");
			//int shoePrices = Integer.parseInt(replaceAll);
			System.out.println("price :"+textTS);
			
		}
			
		//how To Select any price range ex:(500-700). 
		WebElement lowPRPointer = driver.findElement(By.xpath("//a[@class='price-slider-scroll left-handle ui-slider-handle ui-state-default ui-corner-all hashAdded']"));
		snapdeal.scrollToElement(lowPRPointer).perform();
		snapdeal.dragAndDropBy(lowPRPointer, 10, 0);
		
		WebElement highPRPointer = driver.findElement(By.xpath("(//a[contains(@class,'price-slider-scroll')])[2]"));
		snapdeal.dragAndDropBy(highPRPointer, 10, 0);
		
		//To Filter by any colour. --vineeth will clarify
		//my doubt if we need to print  which filter selected -- not able to do gettext
		WebElement tSShoeColour = driver.findElement(By.xpath("//span[@class='filter-color-tile White&Blue ']/parent::label"));
		snapdeal.moveToElement(tSShoeColour).perform();
		tSShoeColour.click();
		tSShoeColour.getText();
		System.out.println("Shoe Colour Filtered:"+tSShoeColour);
	
		
		//how to Verify all the applied filters. --ask vineeth with amazon website 
		
		// To Mouse hover on the first resulting "Training Shoes".
		WebElement firstTS = driver.findElement(By.xpath("(//picture[@class='picture-elem'])[1]"));
		snapdeal.moveToElement(firstTS).perform();
		
		//Click the "Quick View" button. 
		driver.findElement(By.xpath("(//div[@class='center quick-view-bar  btn btn-theme-secondary  '])[1]")).click();
		
		//Print the cost and the discount percentage.
		String firstTSCost = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("First Filtered Training Shoe Cost:"+firstTSCost);
		
		String firstTSDiscount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("First Filtered Training Shoe Discount:"+firstTSDiscount);
		
		//Take a snapshot of the shoes.
		File firstTSScreenshot = driver.getScreenshotAs(OutputType.FILE);
		File save =new File("./snapshot/FirstTSSnap/png");
		FileUtils.copyFile(firstTSScreenshot, save);
		
		//Close the current window. --check above issues are sorted then try to do with window handle by run the code
		
		//Close the main window.
		driver.close();
	}

}
