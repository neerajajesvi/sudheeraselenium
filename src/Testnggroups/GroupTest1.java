package Testnggroups;

import org.testng.annotations.Test;

public class GroupTest1 {
  
  @Test(groups="Retesting",priority=0)
	public void test2121()
	{
		System.out.println(" iam in retesting group");
	}
	@Test(groups="Regression",priority=1)
	public void test333()
	{
		System.out.println("i am in to regression group");
	}
	@ Test(groups="Retesting",priority=0)
	public void test10()
	{
		System.out.println("i am in retesting group");
	}
	@Test(groups="Smoke Test",priority=2)
	public void test345()
	{
		System.out.println(" i am in smoke test");
	}
	@Test(groups="Retesting",priority=0)
	public void test1111()
	{
		System.out.println(" i am in retesting");
	}
	@Test(groups="Smoke Test",priority=2)
	public void test12()
	{
		System.out.println("i am smoke testing");
	}
	@Test(groups={"Regression"},priority=1)
	public void m456()
	{
		System.out.println(" iam in regression group");
	}
	@Test(groups={"Retesting"},priority=0)	
	public void m123()
	{
		System.out.println(" iam in retesting  group");
	}
	@Test(groups="Smoke Test",priority=2)
	public void testCaseThree(){
	System.out.println("Im in testCaseThree - And in Smoke Test Group");
	}

	@Test(groups={"Retesting"},priority=0)
	public void m1()
	{
		System.out.println("iam retesting group");
	}
	@Test(groups={"Regression"},priority=1)
	public void method1()
	{
		System.out.println("i am in regression group");
	}
	@Test(groups={"Regression"},priority=1)
	public void reg1()
	{
		System.out.println("i am in regression group");
	}
	
	@Test(groups={"Retesting"},priority=0)
	public void testsam()
	{
		System.out.println("i am in retesting group");
	}
	
	@Test(groups= { "Regression" },priority=1)
	public void sample()
	{
		System.out.println("i am in regressiontesting");
	}
	@Test(groups="Regression",priority=1)
	public void test()
	{
		System.out.println("i am in regression testing");
	}
	@Test(groups="Retesting",priority=0)
	public void testcase1()
	{
		System.out.println("iam in retesting");
	}
	@Test(groups="Regression",priority=1)
	public void testCaseOne()
	{
		
	System.out.println("Im in testCaseOne - And in Regression Group");
	}
	@Test(groups="Retesting",priority=0)
	public void testcase11()
	{
		System.out.println("iam in to retesting group");
	}
	@Test(groups="Regression",priority=1)
	public void testCaseTwo(){
	System.out.println("Im in testCaseTwo - And in Regression Group");
	}
	
	@Test(groups="Regression",priority=1)
	public void testCaseFour(){
	System.out.println("Im in testCaseFour - And in Regression Group");
	}
	@Test(groups="Retesting",priority=0)
	public void testCaseFive(){
	System.out.println("Im in testCaseFour - And in Retesting Group");
	}
	
	@Test(groups="Retesting",priority=0)
	public void tc5()
	{
		System.out.println("i am in retesting");
	}
	

}
