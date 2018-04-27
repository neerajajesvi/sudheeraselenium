package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mercuryloginpage {
	public  static WebElement ele;

	public static WebElement username_sign(WebDriver driver)
	{
		ele=driver.findElement(By.cssSelector("input[name='userName']"));
		return ele;
				}
	public static WebElement password_sign(WebDriver driver)
	{
		ele=driver.findElement(By.cssSelector("input[name='password']"));
		return ele;
	}
	public static WebElement signin_sign(WebDriver driver)
	{
		ele=driver.findElement(By.cssSelector("input[name='login']"));
		return ele;
	}

	public static WebElement reg_sign(WebDriver driver)
	{
		ele=driver.findElement(By.linkText("REGISTER"));
		return ele;
	}



}
