package week6.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public RemoteWebDriver driver;
	public String fileName;
	@Parameters({"url","username","password","browser"})
	@BeforeMethod
	public void preCondition(String url, String username, String password,String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			driver  = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("Edge")) {
			driver  = new EdgeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver  = new FirefoxDriver();

		}
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
	}
	@AfterMethod
    public void postCondition() {
		driver.close();
	}
	

@DataProvider( name="datas")
public String[][] sendData() throws IOException {
return ReadExcel.excelData(fileName);
}
}
