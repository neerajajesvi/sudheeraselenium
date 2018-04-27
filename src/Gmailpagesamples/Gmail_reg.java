package Gmailpagesamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Gmail_reg {
public static  WebElement ele;
	
	public static WebElement firstname_reg(WebDriver driver)
	{
		ele=driver.findElement(By.name("FirstName"));
		return ele;
	}
	public static WebElement lastname_reg(WebDriver driver)
	{
		ele=driver.findElement(By.id("LastName"));
		return ele;
	}
	
	public static WebElement username_reg(WebDriver driver)
	{
		ele=driver.findElement(By.id("GmailAddress"));
		return ele;
	}


}
