package keyworddrivenframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Helper {
	WebDriver driver;
	 public  void Login() throws Exception{
		 System.setProperty("webdriver.gecko.driver","E:\\Neeraja Software Testing files\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		  driver=new FirefoxDriver();
		 driver.get("http://mail.yahoo.com");
		 driver.manage().window().maximize();
		  WebElement un = driver.findElement(By.id("login-username"));
		    un.sendKeys("neerajakonduru@yahoo.com");
		    WebElement nextbutton = driver.findElement(By.id("login-signin"));
		    nextbutton.click();
		    //driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		    Thread.sleep(4000);
		    WebElement pw=driver.findElement(By.id("login-passwd"));
		   	pw.sendKeys("Jesvitha2");
		   	WebElement signinbutton = driver.findElement(By.id("login-signin"));
		    signinbutton.click();	
}


public  void Compose() throws Exception
{
	  	
	Thread.sleep(30000);
   driver.findElement(By.linkText("Compose")).click();
   driver.findElement(By.id("message-to-field")).sendKeys("subburajuster@gmail.com");
  driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div/div[1]/div[3]/div/div/input")).sendKeys("hi");;
   driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div/div[2]/div[1]/div/div[2]/div/div[1]")).sendKeys("welcome to selenium class");
  driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div/div[2]/div[2]/div/button")).click();
		 
}

	 
	   



	public static void main(String[] args) throws Exception{
		Helper obj=new Helper();
		obj.Login();
		obj.Compose();
		

	}



}
