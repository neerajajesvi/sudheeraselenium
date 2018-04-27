package Mercurytoursframework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.TakesScreenshot;

public class Drivers {
	public static WebDriver getDriver(String browser){
		WebDriver driver = null;
		
		if (browser.equals("firefox")){
			 System.setProperty("webdriver.gecko.driver","E:\\Neeraja Software Testing files\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if (browser.equals("ie")){
			System.setProperty("webdriver.ie.driver", "E:\\Neeraja Software Testing files\\Softwares\\library\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}else if (browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "E:\\Neeraja Software Testing files\\Softwares\\library\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}else{
			System.out.println("you have supplied wrong keyword(keywords are: 'firefoox, 'chrome', 'ie'); hence i am running on htmlunit browser");
			driver = new HtmlUnitDriver();

		}
		
		return driver;
		
	}
	
	public static void takeScreenshot(WebDriver driver, String filePath, String fileName) throws IOException{
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(filePath + fileName + ".png"));
	}

}
