package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class doubleclick {
	WebDriver driver;
  @Test
  public void f()throws Exception {
	  
	    System.setProperty("webdriver.gecko.driver","G:\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://api.jquery.com/dblclick/");
		driver.switchTo().frame(0);
		WebElement element=driver.findElement(By.cssSelector("html>body>div"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);
		doubleClick(element);
		WebElement ele=driver.findElement(By.xpath("/html/body/div"));
		if(ele.isDisplayed()){
			System.out.println("colour changes successfully after we double clicked");
		}
		

		
	}
private void doubleClick(WebElement element) throws Exception{
	// TODO Auto-generated method stub
	try{
		Actions action=new Actions(driver).doubleClick(element);
		action.build().perform();
		System.out.println("Doubleclicked the element");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		
	
	
}
  }

