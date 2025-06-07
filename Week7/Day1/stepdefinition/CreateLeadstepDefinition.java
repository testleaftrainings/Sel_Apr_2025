package stepdefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;

public class CreateLeadstepDefinition extends BaseClass {
	
	@When("click on crmsfa link")
	public void click_on_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	    
	}

	@When("click on leads link")
	public void click_on_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
	    
	}

	@When("click on create leads link")
	public void click_on_create_leads_link() {
		driver.findElement(By.linkText("Create Lead")).click();
	    
	}

	@When("enter the companyName as (.*)$")
	public void enter_the_company_name_as_testleaf(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	    
	}

	@When("enter the firstname as (.*)$")
	public void enter_the_firstname_as_saranya(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	    
	}

	@When("enter the lastname as (.*)$")
	public void enter_the_lastname_as_s(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	    
	}

	@When("click on leads submitbutton")
	public void click_on_leads_submitbutton() {
		driver.findElement(By.name("submitButton")).click();
	    
	}



}
