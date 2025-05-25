package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDown {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate();
		WebElement scroll = driver.findElement(By.xpath("//span[contains(text(),'Amazon.com')]"));
		Actions act=new Actions(driver);
		act.scrollToElement(scroll).perform();
		
		WebElement cli = driver.findElement(By.xpath("//h5[contains(text(),'Amazon Business')]"));
		act.click(cli).perform();
	}

}
