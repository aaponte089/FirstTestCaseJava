package firstCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Login {
	
	static WebDriver driver = new ChromeDriver();
	
	public static void login(){
		try {
			String url = "https://www.microsoft.com/en-us/";
			System.setProperty("webdriver.chrome.driver","C:\\Users\\alber\\eclipse-workspace\\FirstTestCase\\chromedriver.exe");
			
			driver.get(url);
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.getMessage();
		}
	
	}
	
	public static void validateMenu(){
		try {
			Thread.sleep(3000);		
			WebElement officeButton = driver.findElement(By.xpath("//a[contains(text(),'Office')]"));
			String officeValue = officeButton.getText();
			boolean officeValueComparison = officeValue.equals("Office");
			if(officeValueComparison = true) {
				System.out.println("Paso la de Office mi perro");
			}else {
				System.out.println("Fallo la comparacion Office mi pez");
				driver.close();
			}
			WebElement windowsButton = driver.findElement(By.xpath("//a[contains(text(),'Windows')]"));
			String windowsValue = windowsButton.getText();
			boolean windowsValueComparison = windowsValue.equals("Windows");
			if(windowsValueComparison = true) {
				System.out.println("Paso la de Windows mi perro");
			}else {
				System.out.println("Fallo la comparacion Windows mi pez");
				driver.close();
			}
			WebElement surfaceButton = driver.findElement(By.xpath("//a[contains(text(),'Surface')]"));
			String surfaceValue = surfaceButton.getText();
			boolean surfaceValueComparison = surfaceValue.equals("Surface");
			if(surfaceValueComparison = true) {
				System.out.println("Paso la de Surface mi perro");
			}else {
				System.out.println("Fallo la comparacion Surface mi pez");
				driver.close();
			}
			WebElement xboxButton = driver.findElement(By.xpath("//a[contains(text(),'Xbox')]"));
			String FirstValue = xboxButton.getText();
			boolean comparison = FirstValue.equals("Xbox");
			if(comparison = true) {
				System.out.println("Paso la de xbox mi perro");
			}else {
				System.out.println("Fallo la comparacion mi pez");
				driver.close();
			}
			WebElement dealsButton = driver.findElement(By.xpath("//a[contains(text(),'Deals')]"));
			String dealsValue = dealsButton.getText();
			boolean dealsValueComparison = dealsValue.equals("Deals");
			if(dealsValueComparison = true) {
				System.out.println("Paso la de Deals mi perro");
			}else {
				System.out.println("Fallo la comparacion Deals mi pez");
				driver.close();
			}
			WebElement supportButton = driver.findElement(By.xpath("//a[contains(text(),'Support')]"));
			String supportValue = supportButton.getText();
			boolean Supportcomparison = supportValue.equals("Support");
			if(Supportcomparison = true) {
				System.out.println("Paso la de Support mi perro");
			}else {
				System.out.println("Fallo la comparacion Support mi pez");
				driver.close();
			}
			
		} catch (Exception e) {
			driver.close();
			e.getMessage();
		}
	}
	
		public static void accessMenu(){
			try {
				driver.findElement(By.xpath("//a[contains(text(),'Windows')]")).click();
			} catch (Exception e) {
				e.getMessage();
			}
		
		}
	
	

}
