package timeandcapture;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class TimescreenandCaptureshot {
  
	  public WebDriver driver=new FirefoxDriver(); 
	  public String dateNow=null;
	  public void timestamp()
	  {
		  Calendar currentDate=Calendar.getInstance();
		  SimpleDateFormat formatter=new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
		  dateNow=formatter.format(currentDate.getTime());
		  System.out.println("Now the date is:=>"+dateNow);
	  }
	  public void captureScreenshot(String str) throws Exception
	  {
	
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  Files.copy(f,new File("G:\\Softwares\\screenshots\\"+str+dateNow+".png") );
		  //.copyFile(f,new File("G:\\Softwares\\screenshots\\"+str+dateNow+".png"));
	  }
	  @Test
	  public void f() throws Exception {
	  System.setProperty("webdriver.gecko.driver","G:\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");                         
	  
	  driver.get("http://spicejet.com");
	  timestamp();
	  captureScreenshot("Book flight");
	  
}
 
  }

