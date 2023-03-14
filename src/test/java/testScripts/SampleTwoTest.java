package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTwoTest {
	
	 @Test
	  public void cypressSearchTest() {
		WebDriver driver =null;
		
//		  System.setProperty("webdriver.chrome.driver", "F:\\Anandhi\\webdrivers\\chromedriver.exe");
		 	WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		 
		 
//		 WebDriverManager.edgedriver().setup();
//		 WebDriver driver = new EdgeDriver();
		 
//		 WebDriverManager.firefoxdriver().setup();
//		 WebDriver driver = new FirefoxDriver();
		 
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			WebElement searchBox = driver.findElement(By.name("q"));
			searchBox.sendKeys("Cypress Tutorial");
			searchBox.submit();
			Assert.assertEquals(driver.getTitle(), "Cypress Tutorial - Google Search");
			driver.close();
	  }
}
