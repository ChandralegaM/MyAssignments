package week6.day2codingreview;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {
	public String filename;
	public ChromeDriver driver ;
	@Parameters({"url"})
	@BeforeMethod
	public void precondition(String url) {
		
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
	}
	@AfterMethod
	public void postcondition() {
		driver.close();
	}

	@DataProvider(name="scdata")	
	public String[][] senddata() throws IOException{
		String[][] exceldata = ReadExcelSchool.exceldata(filename);
		return exceldata;
		}
	
	}


