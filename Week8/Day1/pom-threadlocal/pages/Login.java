package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class Login extends BaseClass {
	
	
	@When("enter the username as {string}")
	public Login enterUname(String uName) {
		getDriver().findElement(By.id("username")).sendKeys(uName);
		
		/*
		 * Login lp=new Login(); return lp;
		 */
		return this;
	}
	
	@When("enter the password as {string}")
	public Login enterPwd(String pwd) {
		getDriver().findElement(By.id("password")).sendKeys(pwd);
		return this;
	}
	
	
	@And("Click on login button")
	public WelcomePage clickLogin() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
		
	}

}
