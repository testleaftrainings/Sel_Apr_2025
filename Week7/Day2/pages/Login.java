package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.BaseClass;

public class Login extends BaseClass {
	
	public Login(EdgeDriver driver) {
		this.driver=driver;
		
	}
	
	public Login enterUname() {
		driver.findElement(By.id("username")).sendKeys("demoCSR");
		
		/*
		 * Login lp=new Login(); return lp;
		 */
		return this;
	}
	
	
	public Login enterPwd() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	
	
	
	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
		
	}

}
