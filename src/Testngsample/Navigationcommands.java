package Testngsample;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Navigationcommands {
	WebDriver driver;
  @Test
  public void f() throws Exception{
	  driver.findElement(By.id("lst-ib")).sendKeys("selenium");
	  //Thread.sleep(3000);
	  driver.findElement(By.name("btnk")).submit();
	  Thread.sleep(3000);
	  driver.navigate().back();
	  Thread.sleep(3000);
	  driver.navigate().forward();
	  driver.navigate().refresh();
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver","G:\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		
		 driver=new FirefoxDriver();
		driver.get("http://google.com");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
