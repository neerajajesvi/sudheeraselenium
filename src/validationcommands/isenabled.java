package validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class isenabled {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver","G:\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");                         
	  WebDriver driver=new FirefoxDriver();  
	  driver.get("http://www.spicejet.com/");
	  driver.manage().window().maximize();
	  System.out.println("before clicking on oneway");
	  System.out.println(driver.findElement(By.xpath("//label[text()='Return date']")).isEnabled());
	  
	  System.out.println("after clicking on oneway");
	  driver.findElement(By.xpath("//label[text()='One Way']")).click();
	  System.out.println(driver.findElement(By.xpath("//label[text()='Return date']")).isEnabled());
	  
  }
}
