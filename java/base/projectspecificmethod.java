package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadExcel;
import week6.day2codingreview.ReadExcelSchool;

public class projectspecificmethod {
	public String filename;
	public  ChromeDriver driver;
	@BeforeMethod
	public void preCondition() {
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
	}
	@AfterMethod
	public void postCondition() {
	driver.close();
	}
	@DataProvider(name="pomleaddata")	
	public String[][] senddata() throws IOException{
		String[][] exceldata = ReadExcel.exceldata(filename);
		return exceldata;
		}
	
}
