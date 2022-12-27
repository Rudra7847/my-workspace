package com.inetbanking.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage1 {
	WebDriver driver;
	public LoginPage1(WebDriver d)
	{
		driver=d;
	}
	public void setusername(String uname)
	{
		WebElement username=driver.findElement(By.name("uid"));
		
		username.sendKeys(uname);
	}
	
	public void setpassword(String pwd)
	{
		WebElement password=driver.findElement(By.name("password"));
		
		password.sendKeys(pwd);
	}
	
	public void clicksubmit()
	{
		WebElement click=driver.findElement(By.name("btnLogin"));
		click.click();
	}

}
