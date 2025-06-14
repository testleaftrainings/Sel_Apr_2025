package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.Login;

public class RunCreateLead extends BaseClass{
	@BeforeTest
	public void setValues() {
		excelFileName="CreateLead";
		
	}
	@Test(dataProvider="fetchData")
	public void runCreateLead(String uName,String pwd,String cName,String fName,String lName) {
		
		Login lp=new Login(driver);
		lp.enterUname(uName).enterPwd(pwd).clickLogin().clickCrmsfaLink().clickLeads().clickCreateLead().entercName(cName)
		.enterfName(fName).enterLName(lName).clickSubmit().verifyLeads();
		
	}

}
