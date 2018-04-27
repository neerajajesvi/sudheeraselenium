package guru99;






import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

@Test
public class TestScript06 {
	private WebDriver driver; // Selenium control driver
	private String baseUrl; // baseUrl of website Guru99
	
	 @DataProvider(name="GuruTest")
	  public Object[][] testdata() {
		 Object[][] data = new Object[4][2];

			// 1st row
			data[0][0] = Util.USER_NAME;
			data[0][1] = Util.PASSWD;
			//2nd row
			data[1][0] = "invalid";
			data[1][1] = "valid";
			//3rd row
			data[2][0] = "valid";
			data[2][1] = "invalid";
			//4th row
			data[3][0] = "invalid";
			data[3][1] = "invalid";
			return data;

	  }
		public void testCase05(String username, String password) throws Exception {
			String actualTitle;
			String actualBoxMsg;
			// Enter valid UserId
			driver.findElement(By.name("uid")).clear();
			driver.findElement(By.name("uid")).sendKeys(username);
			// Enter valid Password
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys(password);
			// Click Login
			driver.findElement(By.name("btnLogin")).click();
	        
			 try{ 
					Alert alt = driver.switchTo().alert();
					actualBoxMsg = alt.getText(); // get content of the Alter Message
					alt.accept();
					 // Compare Error Text with Expected Error Value					
					AssertJUnit.assertEquals(actualBoxMsg,Util.EXPECT_ERROR);
				
					
				}    
			    catch (NoAlertPresentException Ex){ 
			    			    	
			    	// Get text displayes on login page 
					String pageText = driver.findElement(By.tagName("tbody")).getText();

					// Extract the dynamic text mngrXXXX on page		
					String[] parts = pageText.split(Util.PATTERN);
					String dynamicText = parts[1];

					// Check that the dynamic text is of pattern mngrXXXX
					// First 4 characters must be "mngr"
					AssertJUnit.assertTrue(dynamicText.substring(1, 5).equals(Util.FIRST_PATTERN));
					// remain stores the "XXXX" in pattern mngrXXXX
					String remain = dynamicText.substring(dynamicText.length() - 4);
					// Check remain string must be numbers;
					AssertJUnit.assertTrue(remain.matches(Util.SECOND_PATTERN));
					// Code to take Screenshot
					File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

					// Code to save screenshot at desired location
					FileUtils.copyFile(scrFile, new File("c:\\screenshot.png"));
		        } 
			}		

  @BeforeMethod
  public void beforeMethod() {
	  File pathToBinary = new File(Util.FIREFOX_PATH);
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		driver = new FirefoxDriver();

		// Setting Base URL of website Guru99
		baseUrl = Util.BASE_URL;
		driver.manage().timeouts()
				.implicitlyWait(Util.WAIT_TIME, TimeUnit.SECONDS);
		// Go to http://www.demo.guru99.com/V4/
		driver.get(baseUrl + "/V4/");
  }

 
  

@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}


 
}
