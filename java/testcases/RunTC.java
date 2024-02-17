package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.projectspecificmethod;
import pages.CreateLeadPage;
import pages.LoginPage;
import pages.WelcomePage;

public class RunTC extends projectspecificmethod{
	@BeforeTest
	public void sendvalues() {
		filename="Login";
	}
	@Test(dataProvider="pomleaddata")
	public void runtc(String UserName, String Pwd) {
		//LoginPage lp= new LoginPage(driver);
		//lp.postCondition();
		//lp.preCondition();
		
		//WelcomePage wp =new WelcomePage(driver);
		//wp.clickcrm();
		
		//CreateLeadPage cl =new CreateLeadPage(driver);
	
		//cl.clickCLSubmit();
		//cl.enterCName();
		//cl.enterFName();
		//cl.enterLName();
		//.enterPhNo();
		
		LoginPage lp= new LoginPage(driver);
		lp.username(UserName);
		lp.pswd(Pwd);
		lp.login();
		
	}

}
