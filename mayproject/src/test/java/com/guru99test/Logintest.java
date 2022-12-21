package com.guru99test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Logintest extends BaseTest {
	@Parameters({"userId","userPassword"})
	@Test
	public void verifyuserloginwithcredential(String username,String password)
	{
		loginpage.logintoapplication(username, password);
		String expectedTitle="Guru99 Bank Manager HomePage";
		String actualTitle=cmnDriver.getTitleOfWebPage();
		Assert.assertEquals(actualTitle,expectedTitle);
		
	}
	

}
