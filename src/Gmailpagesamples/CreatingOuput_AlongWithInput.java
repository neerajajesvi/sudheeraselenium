package Gmailpagesamples;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreatingOuput_AlongWithInput {
	public WebDriver driver;
  @Test
  public void f() {
	  try {

		  //Get Filepath
		  FileInputStream fi=new FileInputStream("E:\\Hybrid1_ORGmail.xls");
		  
		  //Open Workbook
		  Workbook book=Workbook.getWorkbook(fi);
		  
		  //open Sheet in above workbook
		  Sheet sht1=book.getSheet("Sheet3");
		  
		  //Create output file
		  FileOutputStream fo=new FileOutputStream("E:\\gmailresult.xls");
		  //Copy workbook data to output file
		  WritableWorkbook wwb=Workbook.createWorkbook(fo,book);
		    
		  //Target Third Sheet
		  
		  Sheet sht3=book.getSheet("Sheet3");
		  			  
		  //Count the Number of rows available in sheet
		  
		  int Rcount=sht3.getRows();
		  			  
		  //Using for loop iterate expected number of rows time
		  for (int i = 1; i < Rcount; i++) 
		  {
			  driver.get("http://gmail.com");
			  //Get Cell Address of Username and password
			  
			  String uid=sht3.getCell(0, i).getContents();
			  
			  String pwd=sht3.getCell(1, i).getContents();
			  
			  //Get Username Cell data from Excel
			  
			  Gmail_login.username_login(driver).clear();
			  Gmail_login.username_login(driver).sendKeys(uid);
			  Gmail_login.nextbutton_login(driver).click();
			  Thread.sleep(3000);
			  Gmail_login.password_login(driver).clear();
			  Gmail_login.password_login(driver).sendKeys(pwd);
			  Gmail_login.loginbutton_login(driver).click();
			  
			  
			
			  
			  
			  if(driver.getTitle().contains("Gmail"))
			  {
				  
				  WritableSheet ws=wwb.getSheet("Sheet3");
				  
				  
				  ws.addCell(new Label(2, i, "Login not sucessful with "+i+"  row input"));
				  
				  
			  }
			  
			  
		  }
		  
		  wwb.write();
		  wwb.close();
		  
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	  
	  
  }
  
  @BeforeTest
  public void launchApplication()
  {
	  System.setProperty("webdriver.gecko.driver","E:\\Neeraja Software Testing files\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  driver.get("http://gmail.com");
	  driver.manage().window().maximize();
  }
  



  }

