package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class frame4 {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver","G:\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");                         
	  WebDriver driver=new FirefoxDriver();  
	  driver.get("http://only-testing-blog.blogspot.de/");
	  driver.manage().window().maximize();
	  driver.switchTo().frame("frame1");
	  driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/table/tbody/tr[1]/td[1]/input")).click();
	  //driver.switchTo().defaultContent();
	  //driver.switchTo().frame("frame2");
	  //driver.findElement(By.xpath("")).sendKeys("welcome");
  }
}
