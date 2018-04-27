package Testngsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class gmailautomation {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver","E:\\Neeraja Software Testing files\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("neeraja65.ece");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys("Jesvitha2");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("to")).sendKeys("subburajuster@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.name("subjectbox")).sendKeys("hi");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[contains(@aria-label,'Message Body')]")).sendKeys("welcome bangaru");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		
  }
}
