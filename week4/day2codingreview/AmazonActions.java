package week4.day2codingreview;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Search for oneplus
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		// To get firstProductPrice
		
		WebElement firstProductPrice = driver.findElement(By.xpath("(//span[@class='a-price']//span[@class='a-price-whole'])[1]"));
		Actions amazon =new Actions(driver);
		//amazon.moveToElement(firstProductPrice).perform();
		System.out.println(firstProductPrice.getText());
		
		//Print the No Of Customer Rating
		
		WebElement noOfCustomerRating = driver.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style']/span)[2]"));
		System.out.println("Customer Rating No:"+noOfCustomerRating.getText());
		
		
		//To click first text link of first image
		
		WebElement firstLink = driver.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']/span)[1]"));
		firstLink.click();
		
		//To Get current window title
		String parentWindow = driver.getTitle();
		System.out.println("Parent Window Title:"+parentWindow);
		
		//To Handles Window
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("Windows id:"+windowHandles);
		
		List<String> CheckWindow =new ArrayList<String>(windowHandles); 
		
		//To switch to window
		driver.switchTo().window(CheckWindow.get(1));
		
		//To Get current window title
		
		String currentWindow = driver.getTitle();
		System.out.println("Current Window Title:"+currentWindow);
	
		//To take the screenshot of the Product displayed
		
		//To Click Add to cart button
		
		WebElement addToCart = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
		amazon.moveToElement(addToCart).perform();
		addToCart.click();
		
		//To get the cart subtotal
		
		WebElement cartSubtotal = driver.findElement(By.id("attach-accessory-cart-subtotal"));
		Thread.sleep(3000);
		String cartSubtotal1 = cartSubtotal.getText();
		System.out.println("Cart Subtotal1:"+cartSubtotal1);
		
		
		//To verify cart subtotal is correct 
		
		if (firstProductPrice==cartSubtotal) {
			
			System.out.println("Exact Price");
			
		} else {
			System.out.println("different Price");
		}
		//driver.close();
		//To Switch to parent window
		driver.switchTo().window(CheckWindow.get(0));
		
		System.out.println("Parent Window title:"+parentWindow);
		
		//driver.close();
		
	}

}
