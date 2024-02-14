package week4.day2codingreview;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NykaActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.nykaa.com/");
		
		Actions nykaa =new Actions(driver);
		
		// To MouseOver on Brands
		WebElement brands = driver.findElement(By.xpath("(//a[@class='css-1mavm7h'])[2]"));
		nykaa.moveToElement(brands).perform();
		
		//To click "L'Oreal Paris"
		WebElement lorealparis = driver.findElement(By.xpath("//img[@src='https://adn-static2.nykaa.com/media/wysiwyg/2019/lorealparis.png']"));
		lorealparis.click();
		String titleLP = driver.getTitle();
		
		if (titleLP.contains("L'Oreal Paris")) {
			System.out.println("Title Contains L'Oreal Paris");
		} else {
			System.out.println("Title doesnot Contains L'Oreal Paris");
		}
		
		//Click on "Sort By" and select "Customer Top Rated". 
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		driver.findElement(By.xpath("(//label[@for='radio_customer top rated_undefined']/div)[2]")).click();
		
		//Click on "Category" and select "Hair" -> "Haircare" -> "Shampoo".
		driver.findElement(By.xpath("//div[@class='filter-open css-1gdff5r']/span[text()='Category']")).click();
		driver.findElement(By.xpath("//div[@class=' css-1nozswx']/span[text()='Hair']")).click();
		driver.findElement(By.xpath("//div[@class=' css-1nozswx']/span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("//div[@class='control-value']/span[text()='Shampoo']")).click();
		
		//Click on "Concern" -> "Color Protection". 
		driver.findElement(By.xpath("//div[@class='filter-open css-1gdff5r']/span[text()='Concern']")).click();
		driver.findElement(By.xpath("//div[@class='control-value']/span[text()='Colour Protection']")).click();
		
		//To Check if the filter is applied with "Shampoo". 
		driver.findElement(By.xpath("//div[@class='css-3i7s5s']//span[@class='filter-value']"));
		
		//Click on "L'Oreal Paris Colour Protect Shampoo".
		WebElement lPShampoo = driver.findElement(By.xpath("//div[@class='control-value']/span[text()='Colour Protection']"));
		nykaa.scrollToElement(lPShampoo).perform();
		lPShampoo.click();
		
		// To get current window Title
		String parentWindow = driver.getTitle();
		System.out.println("Parent Window Title:"+parentWindow);
		
		// to do windows handling 
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("Windows id :"+windowHandles);
		
		
		List<String> checkWindow =new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(checkWindow.get(1));
		
		// To get current window Title
		String currentWindow = driver.getTitle();
		System.out.println("Parent Window Title:"+currentWindow);
		
		//Go to the new window and select the size as "180 ml". 
		driver.findElement(By.xpath("//span[text()='180ml']")).click();
		
		//To Print the MRP of the product.
		
		String mRP = driver.findElement(By.xpath("(//div[@class='css-1d0jf8e']//span[@class='css-1jczs19'])[1]")).getText();
		System.out.println("L'Oreal Paris Colour Protect Shampoo Price:"+mRP);
		
		//To Click on "ADD to BAG". 
		driver.findElement(By.xpath("(//button[@class=' css-13zjqg6'])[1]")).click();
		
		//Go to the Shopping Bag. 
		driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
		
		//Print the Grand Total amount. 
		String grandTotal1 = driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']")).getText();
		System.out.println("Grand Total Price in Bag:"+grandTotal1);
		
		//To Click "Proceed".
		driver.findElement(By.xpath("//span[@class=' css-1l4d0ex e171rb9k3']")).click();
		
		//Click on "Continue as Guest".
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		
		//To Check if the Grand Total is the same as in step 14.
		String grandTotal2 = driver.findElement(By.xpath("//p[@class='css-1e59vjt eka6zu20']")).getText();
		System.out.println("Grand Total Price to Pay:"+grandTotal2);
		if (grandTotal1==grandTotal2) {
			System.out.println("Price is Same");
		} else {
			System.out.println("Price is Different");
		}
		
		driver.close();
		//To Close all windows. 
		driver.switchTo().window(checkWindow.get(0));
		
		String currentWindow1 = driver.getTitle();
		System.out.println("current Window:"+currentWindow1);
		
		driver.quit();
		
		
		
	}

}
