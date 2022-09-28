package TestCases;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgProgram {
	@BeforeSuite
  public void tc1()
  {
	  System.out.println("@BeforeSuite");
  }
	@BeforeTest
	 public void tc2()
	  {
		  System.out.println("@BeforeTest");
	  }
	@BeforeClass
	 public void tc3()
	  {
		  System.out.println("@BeforeClass");
	  }
	@BeforeMethod
	 public void tc4()
	  {
		  System.out.println("@BeforeMethod");
	  }
	@Test
	
	 public void tc5()
	  {
		  System.out.println("@Test");
	  }
	@AfterMethod
	 public void tc6()
	  {
		  System.out.println("@@AfterMethod");
	  }
	@AfterClass
	 public void tc7()
	  {
		  System.out.println("@@AfterClass");
	  }
	
		@AfterTest
		 public void tc8()
		  {
			  System.out.println("@@AfterTest");
		  }
		@AfterSuite
		  public void tc9()
		  {
			  System.out.println("@@AfterSuite");
		  }
}


