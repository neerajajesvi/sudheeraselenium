package keyworddrivenframework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Handlingofmultipletabs {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver","E:\\Neeraja Software Testing files\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.kotak.com/personal-banking/convenience-banking/atm-branch-locator.html");
	 
	  String oldTab = driver.getWindowHandle();

	  //For opening window in New Tab
	  String NewTabLink = Keys.chord(Keys.CONTROL,Keys.RETURN); 
	  						
	  //Thread.sleep(1000);
	  driver.findElement(By.linkText("Login")).sendKeys(NewTabLink);
	  //driver.findElement(By.xpath("//span[text()='Login']")).sendKeys(NewTabLink);
	  

	  // Perform Ctrl + Tab to focus on new Tab window
	  new Actions(driver).sendKeys(Keys.chord(Keys.CONTROL, Keys.TAB)).perform();

	  // Switch driver control to focused tab window
	  driver.switchTo().window(oldTab);

 
  }
}
