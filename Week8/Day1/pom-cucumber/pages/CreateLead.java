package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass{
	
	@And("enter the companyName as(.*)$")
	public CreateLead entercName(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		return this;
		
	}
	@And("enter the firstname as(.*)$")
	public CreateLead enterfName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;
		
	}
	@And("enter the lastname as(.*)$")
	public CreateLead enterLName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("RS");
		return this;
	
}
	@When("click on leads submitbutton")
	public ViewLeads clickSubmit() {
		driver.findElement(By.name("submitButton")).click();
		
		return new ViewLeads();
	}


}
