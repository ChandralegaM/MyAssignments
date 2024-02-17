package week2.day2codingreview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		//driver.findElement(By.xpath("(//a[text()='Create Lead'])")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("(//input[@id='createLeadForm_companyName'])")).sendKeys("IT Company");
		driver.findElement(By.xpath("(//input[@id='createLeadForm_firstName'])")).sendKeys("Chandralega12");
		driver.findElement(By.xpath("(//input[@id='createLeadForm_lastName'])")).sendKeys("Mayagopalan2");
		driver.findElement(By.xpath("(//input[@id='createLeadForm_firstNameLocal'])")).sendKeys("Chandralega1local2");
		driver.findElement(By.xpath("(//input[@id='createLeadForm_departmentName'])")).sendKeys("EEE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Good");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("chandralegagopal2@gmail.com");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd =new Select(state);
		dd.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("Goodday");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		//driver.manage().timeouts().implicitlyWait(long,30);-- doubt how to mention
		driver.close();
		
		

		
		

		
		
		
		
		
		
	}

}
