package log4jsample;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Newtest {
	Logger logger;
	  @Test
	  public void f() throws Exception{
		  logger=Logger.getLogger("devpinoyLogger");
		  logger.debug("starting selenium test execution");
		  System.setProperty("webdriver.gecko.driver","E:\\Neeraja Software Testing files\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		   WebDriver driver=new FirefoxDriver();
		logger.debug(" launching firefox browser");
		driver.get("http://gmail.com");
		logger.debug("navigate to gmail page");
		driver.findElement(By.id("identifierId")).sendKeys("mindqselenium15");
		logger.debug("username is entered");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		logger.debug("next buttonclicked");
		

	  }
}
