package moduledrivenframework;

import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;



public class yahoo_Email_Automation {
	WebDriver driver=new FirefoxDriver();
	

	public void login() throws Exception{
		
		
		  
		driver.get("http://mail.yahoo.com");
		 
		 
		  driver.findElement(By.id("login-username")).sendKeys("neerajakonduru@yahoo.com");
		  driver.findElement(By.id("login-signin")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("login-passwd")).sendKeys("Jesvitha2");
		  driver.findElement(By.id("login-signin")).click();
			
	  }
	  

	public void compose() throws Exception
	{		
	Thread.sleep(30000);
  	driver.findElement(By.xpath("//span[text()='Compose']")).click();
  	driver.findElement(By.id("to-field")).sendKeys("subburajuster@gmail.com");
  	driver.findElement(By.id("subject-field")).sendKeys("hi");
   	driver.findElement(By.xpath("//div[contains(@aria-label,'Message Body')]")).sendKeys("welcome to selenium class");
    driver.findElement(By.linkText("Send")).click();
			//se.waitForPageToLoad("1000");
		   
	}

	 	  public void logout() throws Exception{
	 		 Thread.sleep(3000);
	 	
		   
	  }
		
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.gecko.driver","E:\\Neeraja Software Testing files\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		yahoo_Email_Automation obj =new yahoo_Email_Automation();
		obj.login();
		obj.compose();
		obj.logout();
	}

}

