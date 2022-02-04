package firstCases;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.apache.commons.io.FileUtils;

public class Windows {
	
	
	
	
	public static void selectWindows(){
		try {
			Thread.sleep(2000);
			Login.driver.findElement(By.xpath("//button[contains(text(),'Windows OS')]")).click();
			Thread.sleep(1000);
			Login.driver.findElement(By.xpath("//button[contains(text(),'Windows 10')]")).click();
			File scrFile = ((TakesScreenshot)Login.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("C:\\Users\\alber\\eclipse-workspace\\FirstTestCase\\Screenshots\\screenshot.png"));
		} catch (Exception e) {
			e.getMessage();
		}
	
	}
	
	public static void searchItem(){
		try {
			Thread.sleep(2000);
			Login.driver.findElement(By.xpath("//button[@id='search']")).click();
			WebElement searchButton = Login.driver.findElement(By.xpath("//input[@title='Search Microsoft.com']"));
			searchButton.click();
			Thread.sleep(1000);
			searchButton.sendKeys("Visual Studio");
		} catch (Exception e) {
			e.getMessage();
		}
	
	}
	
	public static void obtainInformation(){
		try {
			
			List<WebElement> elementList = Login.driver.findElements(By.xpath("//li[@role='presentation']"));
			int object = 0;
			String name ="";
			WebElement searchButton = Login.driver.findElement(By.xpath("//input[@title='Search Microsoft.com']"));
			searchButton.click();
			Thread.sleep(1000);
			searchButton.sendKeys("Visual Studio");
			
			for (WebElement element : elementList) {
				if(object >= 3) {
					if(object == 1) {
						name = element.getText();
					}
					System.out.println(element.getText());
					
				}else {
					System.out.println();
				}
				object ++;
			}

			Login.driver.findElement(By.xpath("//input[@title='Search Microsoft.com'][1]")).click();
		} catch (Exception e) {
			e.getMessage();
		}
	
	}
}
