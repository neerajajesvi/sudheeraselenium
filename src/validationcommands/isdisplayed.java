package validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class isdisplayed {
  @Test
  public void f() {
	  
  System.setProperty("webdriver.gecko.driver","G:\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");                         
  WebDriver driver=new FirefoxDriver();  
  driver.get("http://www.makemytrip.com/");
  driver.manage().window().maximize();
  System.out.println("before clicking on multi city");
  System.out.println(driver.findElement(By.xpath("//label[text()='Return']")).isDisplayed());
  
  System.out.println("after clicking on multi city");
  driver.findElement(By.xpath("//label[text()='multi-city']")).click();
  System.out.println(driver.findElement(By.xpath("//label[text()='Return']")).isDisplayed());
  
  
}
}