package Testngsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver.findElement(By.id("RoundTrip")).click();
	  driver.findElement(By.id("FromTag")).sendKeys("Hyderabad");
		driver.findElement(By.id("ToTag")).sendKeys("Chennai");
		driver.findElement(By.id("DepartDate")).sendKeys("17/03/2018");
		driver.findElement(By.id("ReturnDate")).sendKeys("11/04/2018");
		new Select(driver.findElement(By.id("Adults"))).selectByVisibleText("2");
		driver.findElement(By.id("MoreOptionsLink")).click();
		new Select(driver.findElement(By.id("Class"))).selectByVisibleText("Economy");
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("");
		driver.findElement(By.id("SearchBtn")).click();
		//System.out.println("test passed");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver","G:\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		
	 driver=new FirefoxDriver();
		driver.get("http://cleartrip.com");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
