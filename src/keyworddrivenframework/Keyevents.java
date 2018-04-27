package keyworddrivenframework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Keyevents {
	public WebDriver driver=new FirefoxDriver();


  @Test
  public void f() throws Exception {
	  System.setProperty("webdriver.gecko.driver","E:\\Neeraja Software Testing files\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	 
	  driver.get("http://gmail.com");
		 driver.findElement(By.id("Email")).sendKeys("dheeraselenium@gmail.com");
		 driver.findElement(By.id("next")).click();
		  Thread.sleep(4000);
		  driver.findElement(By.id("Passwd")).sendKeys("mindq2016");
	   	  driver.findElement(By.id("signIn")).sendKeys(Keys.ENTER);
	  
}

  }

