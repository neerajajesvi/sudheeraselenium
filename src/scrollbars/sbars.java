package scrollbars;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class sbars {
  @Test(enabled=false)
  public void f() {
	  
   System.setProperty("webdriver.gecko.driver","E:\\Neeraja Software Testing files\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.amazon.in");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("scroll(0,550)");
	
}
  @Test(enabled=true)
  public void f1() {
	  
   System.setProperty("webdriver.gecko.driver","G:\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.makemytrip.com");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	for(int s1=0;;s1++)
	{
		if(s1>=80){
			break;
		}
	
	js.executeScript("window.scrollBy(0,500)","");
	
}
  }
  
}