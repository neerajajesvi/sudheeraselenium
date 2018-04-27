package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class waitcommand {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement un = driver.findElement(By.id("login-username"));
	  un.sendKeys("neerajakonduru@yahoo.com");
	  WebElement nextbutton = driver.findElement(By.id("login-signin"));
	  nextbutton.click();
	  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  WebElement pw=driver.findElement(By.id("login-passwd"));
	  pw.sendKeys("Jesvitha2");
	  WebElement signinbutton = driver.findElement(By.id("login-signin"));
	  signinbutton.click();	
	  //WebDriverWait wait = new WebDriverWait(driver,30);
	  WebDriverWait wait = new WebDriverWait(driver,30);

	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Compose')]")));

	  //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Compose')]")));
  }
	  
      
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver","G:\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
      driver=new FirefoxDriver();
      driver.get("https://mail.yahoo.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ; 
		  	             
 }

  @AfterTest
  public void afterTest() {
	  //driver.quit();
  }

}
