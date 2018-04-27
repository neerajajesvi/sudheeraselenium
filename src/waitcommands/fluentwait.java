package waitcommands;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class fluentwait {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver","G:\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	 WebDriver driver=new FirefoxDriver();
	driver.get("http://www.google.com");
	long startTime=System.currentTimeMillis();
	Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
			.withTimeout(30, TimeUnit.SECONDS)
			.pollingEvery(5,TimeUnit.SECONDS)
			.ignoring(NoSuchElementException.class);
   
try
		
{
WebElement element =  driver.findElement(By.name("btnK"));
wait.until(ExpectedConditions.elementToBeClickable(element));
		
}
catch (Exception e) 
{
			
e.printStackTrace();			
//e.printStackTrace();
		
}
		
		
finally
		
{

		      
long stopTime = System.currentTimeMillis();
		     
long elapsedTime = stopTime - startTime;
		      
System.out.println(elapsedTime);
			
		
}
		
	
  }
}
