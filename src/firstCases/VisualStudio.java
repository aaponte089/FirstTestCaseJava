package firstCases;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;


public class VisualStudio {
	
	
	public static void buyElement(){
		try {
			Thread.sleep(2000);
			JavascriptExecutor scrollDown = (JavascriptExecutor)Login.driver;
			scrollDown.executeScript("window.scrollBy(0,500)");
			String price = Login.driver.findElement(By.xpath("//*[@id=\"rootContainer_BuyBox\"]/section/div[1]/div[3]/div/p/span")).getText();
			Login.driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();	
			
		} catch (Exception e) {
			e.getMessage();
		}
	
	}
	
	public static void selectElement(){
		try {
			Thread.sleep(2000);
			Login.driver.findElement(By.xpath("//select[@aria-label]")).sendKeys("20");
			Thread.sleep(1000);
			Login.driver.findElement(By.xpath("//select[@aria-label]")).sendKeys(Keys.ENTER);
			Login.driver.close();
		} catch (Exception e) {
			e.getMessage();
		}
	
	}
	

}
