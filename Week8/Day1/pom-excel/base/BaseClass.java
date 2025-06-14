package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.CommonIntegrationExcel;


public class BaseClass {
	
public  EdgeDriver driver;

public String excelFileName;
	
	@BeforeMethod
	public void preCondn() {
		
		driver=new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	@AfterMethod
	public void pstCondn() {
		
		driver.close();
		
	}
	@DataProvider(name="fetchData",parallel=true)
	public String[][] sendData() throws IOException {
		return CommonIntegrationExcel.readData(excelFileName);
		
	}

}
