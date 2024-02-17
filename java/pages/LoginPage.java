package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.projectspecificmethod;

public class LoginPage extends projectspecificmethod{

	public LoginPage (ChromeDriver driver) {
		this.driver=driver;
	}

	public LoginPage username(String UserName ) {
		driver.findElement(By.id("username")).sendKeys(UserName);
		return this;
	}
	public LoginPage pswd(String Pwd) {
		driver.findElement(By.id("password")).sendKeys(Pwd);
		return this;
	}
	public WelcomePage login() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}

}



