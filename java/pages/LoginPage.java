package pages;

import org.openqa.selenium.By;
import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{

	public void username() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
	}
	public void pswd() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	public void login() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

}



