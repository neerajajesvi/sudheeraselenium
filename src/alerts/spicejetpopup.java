package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class spicejetpopup {
  @Test
  public void f() throws Exception {
	  System.setProperty("webdriver.gecko.driver","G:\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	  /*WebDriver driver=new FirefoxDriver();
	  
	  driver.get("http://spicejet.com");
	  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
	  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	  driver.findElement(By.linkText("Hyderabad (HYD)")).click();
	  driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
	  driver.findElement(By.linkText("Chennai (MAA)")).click();
	  driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
	  driver.findElement(By.linkText("25")).click();
	  driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
	  driver.findElement(By.linkText("27")).click();
	  new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("2");
	  driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	  Thread.sleep(10000);
	  driver.findElement(By.id("popUpConverter")).click();
	  Thread.sleep(15000);
	  driver.switchTo().window("");
	  new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListBaseCurrency"))).selectByVisibleText("US Dollar(USD)");
	  new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListConversionCurrency"))).selectByVisibleText("Indian Rupee(INR)");
	  driver.findElement(By.id("CurrencyConverterCurrencyConverterView_TextBoxAmount")).sendKeys("100");
	  driver.findElement(By.id("CurrencyConverterCurrencyConverterView_ButtonConvert")).click();
	  //driver.findElement(By.id("ButtonCloseWindow")).click();
	  	 
	  // driver.close();*/
	  	  
	  	  
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.linkText("Kochi (COK)")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.linkText("Tirupati (TIR)")).click();
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		driver.findElement(By.linkText("22")).click();
		driver.findElement(By.id("ctl00_mainContent_txt_Todate")).click();
		driver.findElement(By.linkText("25")).click();
		
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("2");
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("popUpConverter")).click();
		driver.switchTo().window("");
		new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListBaseCurrency"))).selectByVisibleText("US Dollar(USD)");
		new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListConversionCurrency"))).selectByVisibleText("Indian Rupee(INR)");
		driver.findElement(By.id("CurrencyConverterCurrencyConverterView_TextBoxAmount")).sendKeys("100");
		driver.findElement(By.id("CurrencyConverterCurrencyConverterView_ButtonConvert")).click();
		
  }
}
