package cleartrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class cleartrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","G:\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://cleartrip.com");
		driver.findElement(By.id("RoundTrip")).click();
		driver.findElement(By.id("FromTag")).sendKeys("Hyderabad");
		driver.findElement(By.id("ToTag")).sendKeys("Chennai");
		driver.findElement(By.id("DepartDate")).sendKeys("17/03/2018");
		driver.findElement(By.id("ReturnDate")).sendKeys("11/04/2018");
		new Select(driver.findElement(By.id("Adults"))).selectByVisibleText("2");
		driver.findElement(By.id("MoreOptionsLink")).click();
		new Select(driver.findElement(By.id("Class"))).selectByVisibleText("Economy");
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("");
		driver.findElement(By.id("SearchBtn")).click();
		
		
		
		
		
		
	}

}
