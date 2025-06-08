package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.Login;

public class RunCreateLead extends BaseClass{
	@Test
	public void runCreateLead() {
		
		Login lp=new Login(driver);
		lp.enterUname().enterPwd().clickLogin().clickCrmsfaLink().clickLeads().clickCreateLead().entercName()
		.enterfName().enterLName().clickSubmit().verifyLeads();
		
	}

}
