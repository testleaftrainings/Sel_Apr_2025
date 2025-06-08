package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.BaseClass;

public class MyLeads extends BaseClass{
	
	public MyLeads(EdgeDriver driver) {
		this.driver=driver;
	}

	public CreateLead clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLead(driver);
	}

}
