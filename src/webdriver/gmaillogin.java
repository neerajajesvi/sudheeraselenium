package webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.ie.InternetExplorerDriver;
public class gmaillogin {
	public static void main(String[] args) throws Exception{
		//System.setProperty("webdriver.chrome.driver","G:\\Softwares\\library\\chromedriver_win32\\chromedriver.exe");
		
		//WebDriver driver=new ChromeDriver();
		//driver.get("http://gmail.com");
System.setProperty("webdriver.gecko.driver","E:\\Neeraja Software Testing files\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
//System.setProperty("webdriver.ie.driver","G:\\Softwares\\library\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe");
	//WebDriver driver=new InternetExplorerDriver();
		//driver.get("http://gmail.com");
	}

}
