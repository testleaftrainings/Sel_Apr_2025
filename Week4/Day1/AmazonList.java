package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonList {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter the phones in the search field
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobilephones",Keys.ENTER);
		List<WebElement> phones = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		
		List<Integer> list=new ArrayList<Integer>();
		for (WebElement each : phones) {
			String text = each.getText();
			String replaceAll = text.replaceAll(",", "");//9999 
			
			int mob = Integer.parseInt(replaceAll);
			
			//System.out.println(text);
			list.add(mob);
		}
		Collections.sort(list);
		System.out.println(list);
	}

}
