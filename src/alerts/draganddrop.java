package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class draganddrop {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver","G:\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/neeraja/Downloads/draganddrop.html");
		driver.manage().window().maximize();
		WebElement src=driver.findElement(By.xpath("/html/body/div[1]"));
		WebElement dest=driver.findElement(By.xpath("//div[@name='droppable']"));
		Actions builder=new Actions(driver);
		builder.clickAndHold(src).moveToElement(dest).release(src).perform();
		
		
		
  }
}
