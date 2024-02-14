package pages;

import org.openqa.selenium.By;
import base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod{
	
	public void clickcrm() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
}
