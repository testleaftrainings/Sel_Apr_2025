package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicLocators {

	public static void main(String[] args) {
		
		/*
		 * Steps to interact with the webelement
		 * 1)locate the element from dom
		 * 2)interact withe element for providing the input(sendkeys),clicking action(click)
		 * 3)to locate element--->findelement
		 */
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		//enter the uname
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//driver.findElement(By.partialLinkText("CRM")).click();
		
		
		
		
	}

}
