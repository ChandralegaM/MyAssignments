package week4.day2codingreview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTableHA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://finance.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Crypto")).click();
		
		Actions target =new Actions(driver);
		
		//To find the table
		WebElement table = driver.findElement(By.xpath("//div[@class='Ovx(a) Ovx(h)--print Ovy(h) W(100%) ']/table//tbody"));
		target.moveToElement(table).perform();
		
		//To find the Row data
		String rowData = driver.findElement(By.xpath("//div[@class='Ovx(a) Ovx(h)--print Ovy(h) W(100%) ']/table//tbody/tr[5]")).getText();
		System.out.println("Fifth Row:"+rowData);
		
		//To find the Row Count
		List<WebElement> rowCount = driver.findElements(By.xpath("//div[@class='Ovx(a) Ovx(h)--print Ovy(h) W(100%) ']/table//tbody/tr"));
		int rowSize = rowCount.size();
		System.out.println("No of Rows :"+rowSize);
		

		//To find the Column data
		for (int i = 1; i <=rowSize; i++) {
			String columnData = driver.findElement(By.xpath("//div[@class='Ovx(a) Ovx(h)--print Ovy(h) W(100%) ']/table//tbody/tr["+i+"]/td[5]")).getText();
			System.out.println("Fifth Row:"+columnData);
		}
		
		//To Find the Column Count
		List<WebElement> columnCount = driver.findElements(By.xpath("//div[@class='Ovx(a) Ovx(h)--print Ovy(h) W(100%) ']/table//tbody/tr[1]/td"));
		int columnSize = columnCount.size();
		System.out.println("No of Column:"+columnSize);
		
		//To Find the specific Data in table within index5
		String specificData1 = driver.findElement(By.xpath("//div[@class='Ovx(a) Ovx(h)--print Ovy(h) W(100%) ']/table//tbody/tr[3]/td[4]")).getText();
		System.out.println("Specific Data1:"+specificData1);
		
		
		//To Find the specific Data in table after index5 using ruto xpath source and target
		//String specificData2 = driver.findElement(By.xpath("//a[text()[normalize-space()='STETH-USD']]/following::td[text()='49.662M']")).getText();-- not able to get ruto xpath
		//System.out.println("Specific Data2:"+specificData2);
		
		//To Find the all Data in table
		
		for (int i = 1; i <=rowSize; i++) {
			for (int j = 1; j <=columnSize; j++) {
				
				String allData = driver.findElement(By.xpath("//div[@class='Ovx(a) Ovx(h)--print Ovy(h) W(100%) ']/table//tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println("All Table data:"+allData);
			}
			
		}
		
		
		
		
		
	}

}
