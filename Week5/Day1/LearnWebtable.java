package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtable {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//locate the table
		WebElement table = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody"));
		//rowcount
		 List<WebElement> rowCount = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr"));
		 int size = rowCount.size();
		 System.out.println(size);
		 //column count
		 List<WebElement> colCount = driver.findElements(By.xpath("(//table[@role='grid'])[2]/thead/tr/th"));
		 System.out.println(colCount.size());
		 //particular row
		 List<WebElement> singleRow = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr[4]"));
		 for (WebElement rowIter : singleRow) {
			 System.out.println(rowIter.getText());
			
		}
		 //all datas
		 List<WebElement> allDatas = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr/td"));
		 for (WebElement iter : allDatas) {
			 System.out.println(iter.getText());
			
		}
		 //dynamic values
		 for (int i = 1; i < rowCount.size(); i++) {
			 driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr["+i+"]/td"));
			 
			 System.out.println("----------------------");
			 
			 for (int j = 1; j < colCount.size(); j++) {
				 WebElement datas = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr["+i+"]/td["+j+"]"));
				System.out.println(datas.getText());
			}
			
		}
		
		
		

	}

}
