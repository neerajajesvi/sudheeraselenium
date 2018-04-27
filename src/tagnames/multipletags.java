package tagnames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class multipletags {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver","G:\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");                         
	  WebDriver driver=new FirefoxDriver();  
	  driver.get("https://www.facebook.com");
	  List<WebElement> pagelabels=driver.findElements(By.tagName("label"));
	  for(WebElement eachlabel:pagelabels)
	  {
		  System.out.println(eachlabel.getText());
	  }
	  List<WebElement> pagebuttons=driver.findElements(By.tagName("button"));
	  for(WebElement eachbutton:pagebuttons)
	  {
		  System.out.println(eachbutton.getAttribute("id"));
	  }
	  
  }
}
