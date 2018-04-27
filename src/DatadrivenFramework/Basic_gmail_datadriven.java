package DatadrivenFramework;

//import java.io.File;
import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic_gmail_datadriven {
	 
	 
	  public WebDriver driver=new FirefoxDriver();
		
	  	public FileInputStream fi1;
		public Workbook w1;
		public Sheet s1;
		public Sheet s2;
		  
		  public void gmail_login() throws Exception{
			  
				  
			  FileInputStream fil = new FileInputStream("E:\\book1.xls");
			  w1=Workbook.getWorkbook(fi1);
			  s1=w1.getSheet(0);
			  s2=w1.getSheet(1);
			  System.setProperty("webdriver.gecko.driver","E:\\Neeraja Software Testing files\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			  driver.get("http://gmail.com");
		 
	 for (int i = 1; i < s2.getRows(); i++) {
		
		 driver.findElement(By.id(s1.getCell(0, 1).getContents())).sendKeys(s2.getCell(0, i).getContents());
		 driver.findElement(By.xpath(s1.getCell(1, 1).getContents())).click();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath(s1.getCell(2, 1).getContents())).sendKeys(s2.getCell(1, i).getContents());
		
		 driver.findElement(By.xpath(s1.getCell(3, 1).getContents())).click();
		 
		 
		  
	  
}
}}