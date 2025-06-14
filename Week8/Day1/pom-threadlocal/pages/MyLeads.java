package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.And;

public class MyLeads extends BaseClass{
	
	
	@And("click on create leads link")
	public CreateLead clickCreateLead() {
		getDriver().findElement(By.linkText("Create Lead")).click();
		return new CreateLead();
	}

}
