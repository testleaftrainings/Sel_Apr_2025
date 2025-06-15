package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.Login;

public class TC_01 extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		
		excelFileName="login";
		testcaseName="Login";
		testDescription="Login with positive credentials";
		authors="saranya";
		
	}
	@Test(dataProvider="fetchData")
	public void runLogin(String uName,String pwd) {
		Login lp=new Login();
		lp.enteruName(uName).enterPassword(pwd).clickLogin();
		
	}

}
