package hooksimplementation;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import stepdefinition.BaseClass;

public class Hooks extends BaseClass{
	
	
	
	@Before
	public void preCondn() {
		
		driver=new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	@After
	public void pstCondn() {
		
		driver.close();
		
	}

}
