package tagnames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class alllinks {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver","G:\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");                         
	  WebDriver driver=new FirefoxDriver();  
	  driver.get("http://ebay.com");
	  driver.manage().window().maximize();
	  System.out.println("total links present in the page");
	  System.out.println(driver.findElements(By.tagName("a")).size());
	  List<WebElement> pagelinks=driver.findElements(By.tagName("a"));
	  for(WebElement eachlink:pagelinks)
	  {
		  if(!eachlink.getText().isEmpty())
			  {
			  String linktext=eachlink.getText();
			  System.out.println(linktext);
			  String linkhref=eachlink.getAttribute("href");
			  System.out.println(linktext+"===>"+linkhref);
			  }
	  }
	  List<WebElement> pagebuttons=driver.findElements(By.tagName("button"));
	  for(WebElement eachbutton:pagebuttons)
	  {
		  System.out.println(eachbutton.getAttribute("id"));
	  }
  }
}
