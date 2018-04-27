package autoitsamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class winpopup {
	 @Test
	  public void f()throws Exception {
		 
	
		     System.setProperty("webdriver.gecko.driver","E:\\Neeraja Software Testing files\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			  WebDriver driver=new FirefoxDriver();
			  driver.get("https://outfrontmedia.com");
			  driver.findElement(By.xpath("html/body/form/div[4]/header/div[2]/nav/div/div[3]/div[4]/ul/li[1]/a")).click();
			  driver.manage().window().maximize();
			  Thread.sleep(5000);
			  driver.findElement(By.id("ctl00_PlaceHolderMain_hypLinkOutFrontEmpLogin")).click();
			  //Thread.sleep(10000);
			  Runtime.getRuntime().exec("E:\\workspace\\seleniumautomation\\src\\autoitsamples\\windowpopup.exe");

	  
	}

}
