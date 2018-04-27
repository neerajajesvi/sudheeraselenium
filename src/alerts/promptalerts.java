package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class promptalerts {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver","G:\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/neeraja/Downloads/promptalerts.html");
		driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
		Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
		
		
	     alert.accept();
		
  }
}
