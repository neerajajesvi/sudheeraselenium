package pageobjects;

import org.openqa.selenium.WebDriver;

public class mercurymultipletestcases {
	public  static void verifysignin(WebDriver driver)
	 {
		 mercuryloginpage.username_sign(driver).sendKeys("mercury");
		 mercuryloginpage.password_sign(driver).sendKeys("mercury");
		 mercuryloginpage.signin_sign(driver).click();
	 }
	 public static void verifyregistration(WebDriver driver)throws Exception
	 {
		 mercuryloginpage.reg_sign(driver).click();
		 Thread.sleep(3000);
		 mercuryregister.firstname_register(driver).sendKeys("tttt");
		 mercuryregister.lastname_register(driver).sendKeys("hhhh");
		 mercuryregister.phone_register(driver).sendKeys("6666666666");
		 mercuryregister.Email_register(driver).sendKeys("abc@gmail.com");
		 
	 }

}
