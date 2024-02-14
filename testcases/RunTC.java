package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;
import pages.WelcomePage;

public class RunTC extends ProjectSpecificMethod{
	@Test
	public void runtc() {
		LoginPage lp= new LoginPage();
		lp.postCondition();
		lp.preCondition();
		
		WelcomePage wp =new WelcomePage();
		wp.clickcrm();
		
		
	}

}
