package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver1=new EdgeDriver();
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//title of the page
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
	}

}
