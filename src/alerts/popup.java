package alerts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class popup {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver","G:\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		
      WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.online.citibank.co.in");
	  driver.manage().window().maximize();
	  String mainwindow=driver.getWindowHandle();
	  //System.out.println(mainwindow);
	  System.out.println(driver.getTitle());
	  driver.findElement(By.xpath("html/body/div[9]/div[1]/div[5]/ul[3]/li/a")).click();
	  Thread.sleep(5000);
	  //driver.findElement(By.xpath("//span[text()='Login']")).click();
	  Set<String> multiplewindows=driver.getWindowHandles();
	  for (String winname : multiplewindows) 
	  {	
	  if(!winname.equals(mainwindow))
	  {	
	  //Where new window arrive switch to newwindow to get controls
	  driver.switchTo().window(winname);
	  System.out.println(driver.getTitle());
	  				
	  }
	  			
	  			
	  }

	  		
  }
}
