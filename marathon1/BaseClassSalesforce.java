package marathon1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


public class BaseClassSalesforce {
	public ChromeOptions op; 
	public EdgeOptions ep; 
	
	public RemoteWebDriver driver;
	 public String filename;
	@Parameters({"browser","url","uName","pwd","path",}) 
	@BeforeMethod
	public void precondition(String browser,String url,String uName,String pwd,String path)
	{
		
	if (browser.equalsIgnoreCase("chrome")) {
		op =new ChromeOptions();
		op.addArguments("--disable-notifications");
		driver =new ChromeDriver(op);
	}
	else if (browser.equalsIgnoreCase("Edge")) {
		ep =new EdgeOptions();
		ep.addArguments("--disable-notifications");
		driver =new EdgeDriver(ep);
	}
	else if (browser.equalsIgnoreCase("firefox")) {
		op =new ChromeOptions();
		op.addArguments("--disable-notifications");
		driver =new FirefoxDriver();
	}	
		
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get(url);
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uName);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
	driver.findElement(By.xpath("//input[@id='Login']")).click();
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
	driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys(path);
	driver.findElement(By.xpath("(//p[@class='slds-truncate'])[3]")).click();
	WebElement oppo = driver.findElement(By.xpath("//span[text()='Opportunities']"));
	driver.executeScript("arguments[0].click();",oppo);
	
		
	}
@AfterMethod
	public void postcondition() {
	driver.close();
	}
@DataProvider(name="Salesforce")
public String[][] sendData () throws IOException
{

	return ReadExcel.excelDataSF(filename);
}
}
