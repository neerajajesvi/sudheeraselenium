package testsuites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class multibrowsertesting {
	private WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser)
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			 System.setProperty("webdriver.gecko.driver","G:\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			System.out.println("Firefoxbrowser testing");
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","G:\\Softwares\\library\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			System.out.println("chromebrowser testing");
		}
		else if(browser.equalsIgnoreCase("iexplore"))
		{
			System.setProperty("webdriver.ie.driver","G:\\Softwares\\library\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			System.out.println("IEbrowser testing");
			
		}
		driver.manage().window().maximize();
	}
  @Test
  public void f() throws Exception {
	  driver.get("http://cleartrip.com");
  }
  @AfterMethod
  public void td()
  {
	  driver.quit();
  }
}
