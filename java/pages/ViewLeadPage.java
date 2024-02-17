package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.projectspecificmethod;

public class ViewLeadPage extends projectspecificmethod {
	public ViewLeadPage (ChromeDriver driver) {
		this.driver=driver;
	}
	public ViewLeadPage viewLeads(String CompanyName) {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(CompanyName)) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		return this;
	}

}
