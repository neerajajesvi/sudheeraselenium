package testsuites;

import org.testng.annotations.Test;

public class testingpriorities {
  @Test(priority=0)
  public void ffff() {
	  System.out.println("fff method executed");
	  
  }
  @Test(priority=0)
  public void bbbb() {
	  System.out.println("bb method executed");
	  
  }
  @Test(priority=1)
  public void ppp() {
	  System.out.println("pp method executed");
	  
  }
  @Test(priority=2)
  public void aaa() {
	  System.out.println("aa method executed");
	  
  }
}
