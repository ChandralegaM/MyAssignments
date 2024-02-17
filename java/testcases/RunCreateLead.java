package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.projectspecificmethod;
import pages.LoginPage;

public class RunCreateLead extends projectspecificmethod{
	@BeforeTest
	public void sendvalues() {
		filename="Createpage";
	}
	
	@Test(dataProvider="pomleaddata")
	public void RunCreate(String UserName, String Pwd,String CompanyName,String FirstName,String LastName,String Phno)
	{
		LoginPage rc= new LoginPage(driver);
		rc.username(UserName)
		.pswd(Pwd)
		.login()
		.clickcrm()
		.clickLeads()
		.clickCLeads()
		.enterCName(CompanyName)
		.enterFName(FirstName)
		.enterLName(LastName)
		.enterPhNo(Phno)
		.clickCLSubmit()
		.viewLeads(CompanyName);

	
	}
	
}
