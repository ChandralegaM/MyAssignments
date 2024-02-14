package week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.day2.BaseClass;

public class TCR001_CreateLead extends BaseClass{
	@DataProvider( name="datas")
	public String[][] sendData() {
		String[][] data = new String[2][4];
		data[0][0]= "Testleaf";
		data[0][1]= "Subraja";
		data[0][2]= "Subi";
		data[0][3]= "99";
		
		data[1][0]= "Testleaf1";
		data[1][1]= "Subraja1";
		data[1][2]= "Subi1";
		data[1][3]= "991";
		
		return data;
	}
	
@Test(dataProvider="datas",priority= -1)
	public void createLead(String cName, String fName, String lName,String phNo) {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cName)) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		


	}

}
													