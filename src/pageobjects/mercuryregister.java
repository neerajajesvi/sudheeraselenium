package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mercuryregister {
	public  static WebElement ele;

	public static WebElement firstname_register(WebDriver driver)
	{
		ele=driver.findElement(By.cssSelector("input[name='firstName']"));
		return ele;
				}
	public static WebElement lastname_register(WebDriver driver)
	{
		ele=driver.findElement(By.cssSelector("input[name='lastName']"));
		return ele;
				}
	
	public static WebElement phone_register(WebDriver driver)
	{
		ele=driver.findElement(By.cssSelector("input[name='phone']"));
		return ele;
				}
	public static WebElement Email_register(WebDriver driver)
	{
		ele=driver.findElement(By.cssSelector("input[name='userName']"));
		return ele;
				}
	
	


}
