package Testngsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class yahoomail {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver","G:\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://login.yahoo.com");
		driver.findElement(By.id("login-username")).sendKeys("neerajakonduru@yahoo.com");
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("login-passwd")).sendKeys("Jesvitha2");
		Thread.sleep(3000);
		driver.findElement(By.id("login-signin")).click();
		
		Thread.sleep(3000);
		//driver.findElement(By.id("uh-signout")).click();
		//driver.findElement(By.xpath("//span[text()='Next']")).click();
		//Thread.sleep(4000);
		//driver.findElement(By.name("password")).sendKeys("Jesvitha2");
		//driver.findElement(By.xpath("//span[text()='Next']")).click();
		//Thread.sleep(4000);
		//driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
  }
}
