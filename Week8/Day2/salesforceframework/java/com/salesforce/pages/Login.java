package com.salesforce.pages;

import com.framework.testng.api.base.ProjectSpecificMethods;

public class Login extends ProjectSpecificMethods {
	
	public Login enteruName(String uName) {
		
		clearAndType(locateElement("username"),uName);
		reportStep("uname entered sucessfully","pass");
		return this;
		
	}
	
	public Login enterPassword(String pwd) {
		clearAndType(locateElement("password"),pwd );
		reportStep("uname entered sucessfully","pass");
		return this;
		
	}
	
	public WelcomePage clickLogin() {
		click(locateElement("Login"));
		reportStep("logged in sucessfully","pass");
		return new WelcomePage();
		
	}

}
