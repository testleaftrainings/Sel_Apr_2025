package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.BaseClass;

public class MyHomePage extends BaseClass{
	
	public MyHomePage(EdgeDriver driver) {
		this.driver=driver;
	}

	public MyLeads clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeads(driver);
	}

}
