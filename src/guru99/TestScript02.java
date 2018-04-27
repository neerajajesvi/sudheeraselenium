package guru99;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class TestScript02 {
	static WebDriver driver; // Selenium control driver
    private static String baseUrl;
    static String path;// baseUrl of Website Guru99
    public static void setUp() throws Exception {
    	
    	//File pathToBinary = new File(Util.FIREFOX_PATH);
    	//FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
    	//FirefoxProfile firefoxProfile = new FirefoxProfile();
    	path=Util.FIREFOX_PATH;
    	driver = new FirefoxDriver();
    baseUrl = Util.BASE_URL;
	
    driver.manage().timeouts().implicitlyWait(Util.WAIT_TIME, TimeUnit.SECONDS);
	driver.get(baseUrl + "V4");
    }

    
   
   public static void main(String[] args) throws Exception {
    String username, password;
	String actualTitle;
	String actualBoxtitle;
	 System.setProperty("webdriver.gecko.driver","E:\\Neeraja Software Testing files\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();
	  //driver.manage().window().maximize();
	  //driver.get("http://www.demo.guru99.com/v4");
	 
	 setUp();
	   driver.findElement(By.name("uid")).clear();
	   // Good practice to clear a field before useby
	   driver.findElement(By.name("uid")).sendKeys(Util.USER_NAME);
	    driver.findElement(By.name("uid")).sendKeys(Util.USER_NAME);  // Enter username

	   
	    driver.findElement(By.name("password")).clear(); // Good practice to clear a field before use
	    driver.findElement(By.name("password")).sendKeys(Util.PASSWD);  // Enter Password
       driver.findElement(By.name("btnLogin")).click();

	  	actualTitle = driver.getTitle();
		if (actualTitle.contains(Util.EXPECT_TITLE)) {
				    System.out.println("Test case: Passed");
		} 
		else {
				    System.out.println("Test case : Failed");
		}
				
	    driver.close();
	    
	

    }


}
