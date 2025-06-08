package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.BaseClass;

public class CreateLead extends BaseClass{
	
	public CreateLead(EdgeDriver driver) {
		this.driver=driver;
	}
	public CreateLead entercName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		return this;
		
	}
	public CreateLead enterfName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("HariPrasad");
		return this;
		
	}

	public CreateLead enterLName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("RS");
		return this;
	
}
	public ViewLeads clickSubmit() {
		driver.findElement(By.name("submitButton")).click();
		
		return new ViewLeads(driver);
	}


}
