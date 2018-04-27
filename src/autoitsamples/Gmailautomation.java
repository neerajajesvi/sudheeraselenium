package autoitsamples;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Gmailautomation {
	@Test
	  public void f() throws Exception{
		
	
	 System.setProperty("webdriver.gecko.driver","E:\\Neeraja Software Testing files\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		  driver.get("http://gmail.com");
		  driver.findElement(By.id("identifierId")).sendKeys("neeraja.jesvi@gmail.com");
		  driver.findElement(By.xpath("//span[text()='Next']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.name("password")).sendKeys("Jesvitha2");
		  driver.findElement(By.xpath("//span[text()='Next']")).click();	
		    Thread.sleep(30000);
		      driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
		      Thread.sleep(2000);
		    driver.findElement(By.name("to")).sendKeys("neeraja65.ece@gmail.com");
		    driver.findElement(By.name("subjectbox")).sendKeys("hi");
		    //driver.findElement(By.id("rtetext")).sendKeys("nnnnnnnn");
			  driver.findElement(By.xpath("//div[contains(@aria-label,'Message Body')]")).sendKeys("welcome to selenium class");
			  driver.findElement(By.xpath("//div[contains(@aria-label,'Attach files')]")).click();
			//  driver.findElement(By.xpath("//span[@title='Attach file']")).click();
			 // driver.findElement(By.xpath("//a[text()='Attach files from computer']")).click();
			  attach("E:\\Op.properties");
			Thread.sleep(13000);
			  //driver.findElement(By.xpath("//span[@title='Attach file']")).click();
			  //driver.findElement(By.xpath("//a[text()='Attach files from computer']")).click();
			  //driver.findElement(By.xpath("//div[contains(@aria-label,'Attach files')]")).click();
			  //attach("C:\\Users\\Sudheera\\FEB7to10\\seleniumsamples\\src\\autoit2609\\yahooregister.xls");
			  //Thread.sleep(20000);
			  driver.findElement(By.xpath("//div[text()='Send']")).click();
	  }
	  
	  public  void attach(String fname) throws Exception{
		    try {
		        String[] commands = new String[]{};
		        commands = new String[]{"E:\\workspace\\seleniumautomation\\src\\autoitsamples\\sample.exe", fname}; //location of the autoit executable
		        Runtime.getRuntime().exec(commands);
		        System.out.println("executing AutoIT script");
		     } catch (IOException e) {
		     	System.out.println(e.toString());
		     }

		  
			
			  
	  }

}
