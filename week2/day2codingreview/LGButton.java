package week2.day2codingreview;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LGButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only mr-2 mb-2']/span")).click();
		String title = driver.getTitle();
		System.out.println("Title of the page :"+title);
		
		// back to original screen
		driver.navigate().back();
		
		//To check if the button wih the text "confirm if the button is disabled " is disabled
		
		boolean button = driver.findElement(By.xpath("//div[@class='card']/button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']")).isEnabled();
		if (button==true) {
			System.out.println("Enabled");
			
		} else {
			System.out.println("Is Not Enabled");
		}
		
		//To find and print the position of the button with the text Submit
			
		Point location = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left mr-2']/span[@class='ui-button-text ui-c']")).getLocation();
		System.out.println(location);
		//if (location.contains("Submit")) {-- check why contains gettng error 
			//System.out.println("Pass");
			
		//} else {
		//	System.out.println("fail");
		//}
		
		//To find and print the background color of the button with the text Find the Save button color
		
	
		String bg = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-secondary mr-2 mb-2']/span[@class='ui-button-text ui-c']")).getCssValue("color");
		System.out.println(bg);
		//if (color.contains("button color")) {
		//	System.out.println("Pass");
			
		//} else {
		//	System.out.println("fail");
		//}
		
		//To find and print the height and width of the button with the text Find the height and width of this button
		
		Dimension hw = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-right']/span[@class='ui-button-text ui-c']")).getSize();
		System.out.println(hw);
		//if ( hw.contains("height and width")) {
		//	System.out.println("Pass");
			
		//} else {
		///	System.out.println("Pass");
		//}
		driver.close();
	}
}
		

