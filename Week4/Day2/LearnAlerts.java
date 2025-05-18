package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlerts {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//simple Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		
		//transfer the driver control
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		String text = driver.findElement(By.id("simple_result")).getText();
		System.out.println(text);
		
		//confirmation alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		//Alert alert2 = driver.switchTo().alert();
		alert.dismiss();
		//prompt alerts
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		alert.sendKeys("saranya");
		alert.accept();
		//sweet alerts
		
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		//alert.dismiss();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();

	}

}
