package testng;

import org.junit.Before;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {
  @Test
  public void test_one()
  {
	  System.out.println("execute test1");
  }
  @Test
  public void test_two()
  {
	  System.out.println("execute test2");
  }
  @BeforeMethod
  public void before_tes()
  {
	  System.out.println("execute before test");
  }
  @AfterMethod
  public void after_tes()
  {
	  System.out.println("execute after test");
  }
}
