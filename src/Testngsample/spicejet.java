package Testngsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class spicejet {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver","G:\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://spicejet.com");
		driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[1]/div[2]/div[3]/div/div[2]/table/tbody/tr/td[2]/label")).click();
	    Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("Goa (GOI)");
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("Tirupati (TIR)");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_view_date1")).sendKeys("12/03");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[1]/div[2]/div[3]/div/div[4]/button")).click();
		//driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("2");
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

  }
}
