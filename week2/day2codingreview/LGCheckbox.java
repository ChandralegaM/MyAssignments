package week2.day2codingreview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LGCheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(30));
		driver.get("https://leafground.com/checkbox.xhtml");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		driver.findElement(By.xpath("//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget']/div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		
		// how to verify expeced message is displayed
		
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']//div)[2]")).click();
		
		// how to verify which tristate option is chosen
		
		
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		
		// how to verify expeced message is displayed
		
		boolean lg = driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-disabled ui-state-disabled']")).isSelected();
		if (lg==true) {
			System.out.println("Button is enabled");
			
		} else {
			System.out.println("Button is disabled");
		}
		// how to get selected option -- //div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']/following-sibling::/div
		driver.findElement(By.xpath("//ul[@class='ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all']']")).click();
		driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all']")).sendKeys("Rome");
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-search']")).click();
		driver.close();		
		
		
	}

}
