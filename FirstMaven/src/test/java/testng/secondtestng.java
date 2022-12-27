package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class secondtestng {
  @Test
  public void f1() 
  {
	  System.out.println("Inside F1 method");
	  //Assert.assertTrue(false);
	 
  }
  @Test
  public void f2()
  {
	  System.out.println("Inside F2 method");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Execute Before method");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("Execute After method");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("Execute Before class");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("Execute After class");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("Execute Before Test");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("Execute After Test");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("Execute Before Suite");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("Execute After Suite");
  }

}
