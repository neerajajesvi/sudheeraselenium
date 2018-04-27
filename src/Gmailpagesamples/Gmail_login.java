package Gmailpagesamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Gmail_login {
	public  static WebElement ele;
	public static WebElement username_login(WebDriver driver)
		{
			ele=driver.findElement(By.id("identifierId"));
			return ele;
		}
		public static WebElement nextbutton_login(WebDriver driver)
		{
			ele=driver.findElement(By.xpath("//span[text()='Next']"));
			return ele;
		}
		public static WebElement password_login(WebDriver driver)
		{
			ele=driver.findElement(By.name("password"));
			return ele;
		}
		public static WebElement loginbutton_login(WebDriver driver)
		{
			ele=driver.findElement(By.xpath("//span[text()='Next']"));
			return ele;
		}
		public static WebElement moreoptions_login(WebDriver driver)
		{
			ele=driver.findElement(By.xpath("//div[text()='More options']"));
			return ele;
		}
		public static WebElement createaccount_login(WebDriver driver)
		{
			ele=driver.findElement(By.xpath("//div[text()='Create account']"));
			return ele;
		}

}
