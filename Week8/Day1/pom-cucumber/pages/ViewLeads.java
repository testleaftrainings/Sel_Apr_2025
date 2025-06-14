package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.Then;

public class ViewLeads extends BaseClass {
	
	
	@Then("viewLeadsPage is displayed")
	public ViewLeads verifyLeads() {
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		if (text.contains("Hari")) {
			System.out.println("text matched");
			
		} else {
			System.out.println("text not matched");

		}
		return this;
		
	}

}
