package testng;

import org.testng.Assert;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {
	
	@Test(dataProvider="testdata")
	public void login(String s1,String s2)
	{
		System.out.println("username "+s1);
		System.out.println("password "+s2);
	}
	
	@DataProvider
	public Object[][] testdata()
	{
		return new Object[][] {{"vinayak","lecturer"},{"sonali","staffnurse"}};
	}
	
	@Test(dataProvider="usenumber")
	public void additionverify(int a,int b,int c)
	{
		int x=a+b;
		Assert.assertEquals(c,x);
	}
	
	@DataProvider
	public Object[][] usenumber()
	{
		return new Object[][] {{1,2,3},{2,3,1}};
	}

}
