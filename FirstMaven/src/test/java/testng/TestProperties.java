package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestProperties {
  @Test(enabled=false)
  public void f1() 
  {
	  System.out.println("Inside F1 Method");
  }
  @Test(invocationCount=5)
  public void f2()
  {
	  System.out.println("Inside F2 Method");
  }
  @Test
  public void f3()
  {
	  System.out.println("Inside F3 Method");
  }
  @Test
  public void f4()
  {
	  System.out.println("Inside F4 Method");
	  Assert.assertTrue(false);
  }
  @Test(dependsOnMethods= {"f4","f3"})
  public void f5()
  {
	  System.out.println("Inside F5 Method");
  }
}
