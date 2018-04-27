package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class rightclick {
  @Test

	  public void f() {                                                                                                                              
		  System.setProperty("webdriver.gecko.driver","G:\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");                         
		  WebDriver driver=new FirefoxDriver();  
		  driver.get("http://jqueryui.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.linkText("Autocomplete")).click();
		  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		  driver.findElement(By.id("tags")).sendKeys("java");
		  driver.switchTo().defaultContent();
		  driver.findElement(By.linkText("Accordion")).click();
  }
}

