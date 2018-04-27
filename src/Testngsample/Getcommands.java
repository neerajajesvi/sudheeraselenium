package Testngsample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Getcommands {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver","G:\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		//String s1=driver.getTitle();
		//System.out.println(s1);
		//String s2=driver.getCurrentUrl();
		//System.out.println(s2);
		String s3=driver.getPageSource();
		System.out.println(s3);
		
		
  }
}
