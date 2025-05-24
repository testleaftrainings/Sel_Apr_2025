package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
	/*
	 * no such element exception--->1)locator
	 * 	                            2)wait stmts
	 * 	                            3)element is in the frame
	 */

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//switch over to frame
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("Click")).click();

	}

}
