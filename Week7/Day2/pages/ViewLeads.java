package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.BaseClass;

public class ViewLeads extends BaseClass {
	
	public ViewLeads(EdgeDriver driver) {
		this.driver=driver;
	}

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
