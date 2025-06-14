package base;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;


public class BaseClass extends AbstractTestNGCucumberTests {
	
	private static final ThreadLocal<EdgeDriver> eDriver=new ThreadLocal<EdgeDriver>();
	
	public void setDriver() {
		eDriver.set(new EdgeDriver());
	}
	
	public EdgeDriver getDriver() {
		return eDriver.get();
	}
	
	@BeforeMethod
	public void preCondn() {
		
		setDriver();//initialize the driver
		
		getDriver().get("http://leaftaps.com/opentaps/control/main");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	@AfterMethod
	public void pstCondn() {
		
		getDriver().close();
		
	}

}
