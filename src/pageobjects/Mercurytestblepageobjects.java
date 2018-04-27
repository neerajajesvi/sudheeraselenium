package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Mercurytestblepageobjects {
  @Test
  public void f() throws Exception {
	  System.setProperty("webdriver.gecko.driver","E:\\Neeraja Software Testing files\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://newtours.demoaut.com/");
	  driver.manage().window().maximize();
	  //mercurymultipletestcases.verifyregistration(driver);
	  mercurymultipletestcases.verifysignin(driver);

  }
}
