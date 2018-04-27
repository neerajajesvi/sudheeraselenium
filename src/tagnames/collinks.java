package tagnames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class collinks {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver","G:\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");                         
	  WebDriver driver=new FirefoxDriver();  
	  driver.get("http://ebay.com");
	  driver.manage().window().maximize();
	  WebElement collinks=driver.findElement(By.xpath(""));
	  //System.out.println("no of col links in the page");
	  //System.out.println(collinks.findElements(By.tagName("a")).size());
	  List<WebElement> collist=collinks.findElements(By.tagName("a"));
	  for(WebElement collink:collist)
	  {
		  if(!collink.getText().isEmpty())
			  {
			  String linktext=collink.getText();
			  System.out.println(linktext);
			  
			  }
	  }
	  List<WebElement> pagebuttons=driver.findElements(By.tagName("button"));
	  for(WebElement eachbutton:pagebuttons)
	  {
		  System.out.println(eachbutton.getAttribute("id"));
	  }
  }
  }

