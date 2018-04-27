package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class alerttest {
  @Test(enabled=true)
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver","G:\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://jsbin.com/usidix/1");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
		Alert a1=driver.switchTo().alert();
        
		System.out.println(a1.getText());
		
	     a1.accept();
		driver.quit();
  }
}
