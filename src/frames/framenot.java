package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class framenot {
  @Test
  public void f() throws Exception {
	  System.setProperty("webdriver.gecko.driver","G:\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");                         
	  WebDriver driver=new FirefoxDriver();  
	  driver.get("https://retail.onlinesbi.com/retail/login.htm");
	  //String str=driver.getPageSource();
	  //System.out.println(str);
	  driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
	  driver.findElement(By.id("username")).sendKeys("kkkk");
	  Thread.sleep(3000);
	  driver.findElement(By.name("password")).sendKeys("iii");
	 
  }  
  }

