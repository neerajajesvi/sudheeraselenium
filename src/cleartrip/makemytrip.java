package cleartrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class makemytrip {
  @Test
  public void f() throws Exception {
	  System.setProperty("webdriver.gecko.driver","G:\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");                         
	  WebDriver driver=new FirefoxDriver();  
	  driver.get("https://www.makemytrip.com/");
	  driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/section/div[1]/div/div[2]/label")).click();
	  driver.findElement(By.id("hp-widget__sfrom")).sendKeys("New Delhi (DEL)");
	  driver.findElement(By.id("hp-widget__sTo")).sendKeys("Mumbai (BOM)");
	  driver.findElement(By.id("hp-widget__depart")).click();
	 driver.findElement(By.linkText("22")).click();
	 driver.findElement(By.id("hp-widget__return")).click();
	// driver.findElement(By.linkText("24")).click();
	 
	 
	 // driver.findElement(By.id("hp-widget__return")).click();
	 
	  driver.findElement(By.id("hp-widget__return")).sendKeys("24");
	 
	  driver.findElement(By.id("searchBtn")).click();
  }
}
