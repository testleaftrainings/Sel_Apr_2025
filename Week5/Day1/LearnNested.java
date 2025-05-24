package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNested {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//ouerframe
		WebElement nestFrame = driver.findElement(By.xpath(" //h5[contains(text(),'Click Me (Inside Nested frame)')]/following::iframe"));
		driver.switchTo().frame(nestFrame);
		//inner frame
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		
		//driver.switchTo().defaultContent();//comes out of all the frame
		
		//driver.switchTo().parentFrame();//switch to its immediate parent frame
		
	}

}
