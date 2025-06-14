package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.BaseClass;

public class Login extends BaseClass {
	
	public Login(EdgeDriver driver) {
		this.driver=driver;
		
	}
	
	public Login enterUname(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
		
		/*
		 * Login lp=new Login(); return lp;
		 */
		return this;
	}
	
	
	public Login enterPwd(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
		return this;
	}
	
	
	
	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
		
	}

}
