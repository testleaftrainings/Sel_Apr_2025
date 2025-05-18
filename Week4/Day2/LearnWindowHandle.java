package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//get the addresss of the current window
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow );//118CDE05F6A6E71EB86BFC3FD72890DC
		System.out.println(driver.getTitle());
		
		//click
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> childWindow = driver.getWindowHandles();
		
		//convert set into list
		
		List<String> listWindow=new ArrayList<String>(childWindow);
		
		for (int i = 0; i < listWindow.size(); i++) {
			String window = listWindow.get(i);
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
		}
		
		/*
		 * //navigate to child window driver.switchTo().window(listWindow.get(1));
		 * 
		 * //addresss of childwindow String windowHandle = driver.getWindowHandle();
		 * System.out.println(windowHandle); System.out.println(driver.getTitle());
		 * 
		 * driver.close();
		 */
		//driver.switchTo().window(listWindow.get(1));//no such window exception
	}

}
