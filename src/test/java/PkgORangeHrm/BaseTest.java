package PkgORangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseTest {
	WebDriver driver;
	@Test
	public  void launchBrowser() {
	
		  String driverPath = System.getProperty("user.dir") +
		  "\\src\\test\\java\\PkgORangeHrm\\BrowserDrivers\\chromedriver.exe";
		  System.out.println(driverPath); System.setProperty("webdriver.chrome.driver",
		  driverPath); driver = new ChromeDriver();
//		 
//		WebDriverManager ref = WebDriverManager.chromedriver();
//		ref.setup();
//	 	WebDriver  driver = new ChromeDriver();
//	 	System.out.println("browser launch");
	 	
	 	driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	 	
	 
	}

//	@Test
//	public void Login() {
//		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		driver.findElement(By.id("btnLogin")).click();
//	}
}
