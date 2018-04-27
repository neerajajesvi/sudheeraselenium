package keyworddrivenframework;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Keyword_driven extends Helper 
{
	static WebDriver driver = new FirefoxDriver();
  @Test
  public void f() throws Exception {
	  System.setProperty("webdriver.gecko.driver","E:\\Neeraja Software Testing files\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	  driver.get("http://mail.yahoo.com");
      // Workbook workbook;
       try {
    	   Workbook workbook = Workbook.getWorkbook(new File("E:\\yahoo_Keyworddriven.xls"));
              Sheet sheet = workbook.getSheet(0);
             
              
       //code to read Test Case
              int rows=sheet.getRows();
              for(int i=1;i<rows;i++)
              {
                    String TC_name=sheet.getCell(0,i).getContents().toString();
                    //Call function ExecuteFunction to Read Mapped Function
                    Execute(TC_name);
                   
             
              }
              //Close Browser
              quitdriver();
             
       } catch (BiffException e) {
              // TODO Auto-generated catch block
            System.out.println(e);
       } catch (IOException e) {
              // TODO Auto-generated catch block
              System.out.println(e);
       }
      
}
  public void Execute(String Casename)throws Exception
	 {
	        String Option=Casename.trim();
	       
	  if(Option.equalsIgnoreCase("TC_Login") )
	  {
		  //Execute Login
		  Login();
	  }
	  else if(Option.equalsIgnoreCase("TC_Compose"))
	  {
	         //Execute Compose Function
		  Compose();
	  }
	  else if(Option.equalsIgnoreCase("TC_Logout"))
	  {
	        //Execute Logout
	        // Logout();
	  }
	  }
  public static void quitdriver()
	 {
	  driver.quit();
	 }
	

  }

