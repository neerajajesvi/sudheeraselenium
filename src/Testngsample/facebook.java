package Testngsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class facebook {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver","E:\\Neeraja Software Testing files\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("neeraja65.ece@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Ruthvik27");
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_a")).click();
		Thread.sleep(3000);
		//driver.findElement(By.id("userNavigationLabel")).click();
		//driver.findElement(By.id("u_1c_5")).click();
		//driver.findElement(By.xpath("//div[text()='Account Settings']")).click();
		//driver.findElement(By.id("u_1f_5")).click();
		//driver.findElement(By.xpath("/html/body/div[21]/div/div/div/div/div[1]/div/div/ul/li[14]")).click();
  }
}
