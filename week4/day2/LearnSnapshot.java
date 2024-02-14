package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSnapshot {

	public static void main(String[] args) throws IOException {
	
		// Create a folder in current project
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://finance.yahoo.com/");
		
		//Step 1-- it will take a snap of whole page
		
		File snap1 = driver.getScreenshotAs(OutputType.FILE);
		
		//step2 -- To save the snap inside the folder path
		
		File save1 = new File("./Snapshot/snapshot1.jpeg");
		
		// step3 -- combine step1 and 2
		FileUtils.copyFile(snap1, save1);
		
		// To take snap of particular element
		WebElement particularElement = driver.findElement(By.linkText("Crypto"));
		
		//Step 1-- it will take a snap of whole page
		
		File snap2 = particularElement.getScreenshotAs(OutputType.FILE);
				
		//step2 -- To save the snap inside the folder path
				
		File save2 = new File("./Snapshot/snapshot2.jpeg");
				
		// step3 -- combine step1 and 2
		
		FileUtils.copyFile(snap2, save2);
	}

}
