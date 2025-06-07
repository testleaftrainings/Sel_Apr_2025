package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import hooksimplementation.Hooks;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	
	
	@Given("Launch the browser and load the url")
	public void launch_the_browser_and_load_the_url() {
		 driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	    
	}

	@When("enter the username as {string}")
	public void enter_the_username_as_demosalesmanager(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	    
	}
	
	

	@When("enter the password as {string}")
	public void enter_the_password_as_crmsfa(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	    
	}

	@Then("Homepage is displayed")
	public void homepage_is_displayed() {
		String title = driver.getTitle();
		if (title.contains("LeafTaps")) {
			System.out.println("text matched");
			
		} else {
			System.out.println("text not matched");

		}
		
	    
	}
	@But("Errormsg is displayed")
	public void errorMsgIsDisplayed() {
		String text = driver.findElement(By.id("errorDiv")).getText();
		if (text.contains("Errors")) {
			System.out.println("error text matched");
		} else {
			System.out.println("error text is not matched");
		}
		
	}



}
