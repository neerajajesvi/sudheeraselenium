package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScript01 {
	  public static void main(String[] args) throws Exception {	  
			
	    	//Setup Firefox driver 
		  System.setProperty("webdriver.gecko.driver","E:\\Neeraja Software Testing files\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	    	WebDriver driver = new FirefoxDriver();
	    	String baseUrl = "http://www.demo.guru99.com/V4/";
	    	
	    	// launch Firefox and direct it to the Base URL
	    	driver.get(baseUrl);


		    // Enter username
		    driver.findElement(By.name("uid")).sendKeys("mngr124036 ");

		    // Enter Password
		    driver.findElement(By.name("password")).sendKeys("yjUtAnY ");
	   
		    // Click Login
		    driver.findElement(By.name("btnLogin")).click();


		    }
		
}
