package week7.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//instantiate WebDriverWait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		WebElement firstElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click']")));
		firstElement.click();
		
		WebElement visible = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		
		boolean display = visible.isDisplayed();
		System.out.println(display);
		
		
		//invisiblity
		
		WebElement invis = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Click'])[2]")));
		invis.click();
	
		Boolean invisiblity = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='I am about to hide']")));
		System.out.println(invisiblity);
	}

}
