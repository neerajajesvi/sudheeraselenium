package DatadrivenFramework;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BDDexample {
	public WebDriver driver;
	  @Test
	  public void f() 
	  {
		  
		  try {
			
			  //Read File
			  FileInputStream fi=new FileInputStream("E:\\mercurybdd.xls");
			  
			  //Get Workbook from above path
			  Workbook wb=Workbook.getWorkbook(fi);
			  
			  //Get sheet from above path
			  Sheet sht=wb.getSheet(0);
			  		  		  
			  //Get Number of rows available in sheet
			  int rcount=sht.getRows();
			  
			  for (int i = 1; i < rcount; i++) 
			  {
				  
				  //Target object type
				  String objtype=sht.getCell(2, i).getContents();
				  System.out.println(objtype);
				  
				  //Target propid from first column in same row
				  String propid=sht.getCell(1, i).getContents();
				  //Target input from input column
				  String input=sht.getCell(3, i).getContents();
				  
				  
				  switch (objtype) 
				  {
				  
				case "Link":
					driver.findElement(By.linkText(propid)).click();
					Thread.sleep(4000);
					break;
					
				case "PartialLink":
					driver.findElement(By.partialLinkText(propid)).click();
					Thread.sleep(4000);
					break;
								
				case "text":
					driver.findElement(By.name(propid)).sendKeys(input);
					break;

				case "Dropdown":
					new Select(driver.findElement(By.id(propid))).selectByVisibleText(input);
					break;
				
				case "Button":
					driver.findElement(By.name(propid)).click();
					Thread.sleep(3000);
					break;
				
				case "Radio":
					driver.findElement(By.id(propid)).click();
					break;

				case "Checkbox":
					driver.findElement(By.id(propid)).click();

				default:
					break;
				}
				  
			  }
		  }
			  catch (Exception e) {
			System.out.println(e);
		}
		  
	  }
	  
	  @BeforeTest
	  public void launchApplication()
	  {
		  System.setProperty("webdriver.gecko.driver","E:\\Neeraja Software Testing files\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.get("http://newtours.demoaut.com/");
		  driver.manage().window().maximize();
	  }

}
