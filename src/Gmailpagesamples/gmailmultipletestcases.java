package Gmailpagesamples;

import org.openqa.selenium.WebDriver;

public class gmailmultipletestcases {
	public  static void verifysignin(WebDriver driver)throws Exception
	{
		Gmail_login.username_login(driver).sendKeys("mindqselenium15@gmail.com");
		Gmail_login.nextbutton_login(driver).click();
		Thread.sleep(4000);
		Gmail_login.password_login(driver).sendKeys("mindq@123");
		Gmail_login.loginbutton_login(driver).click();
	}
	
	public static void verifyreg(WebDriver driver) throws Exception
	{
		Gmail_login.moreoptions_login(driver).click();
		Thread.sleep(2000);
		Gmail_login.createaccount_login(driver).click();
		Thread.sleep(5000);
		Gmail_reg .firstname_reg(driver).sendKeys("hhhhh");
		Gmail_reg .lastname_reg(driver).sendKeys("jjjjj");
		Gmail_reg .username_reg(driver).sendKeys("kkkk");
		
	}


}
