package com.inetbanking.pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
		@FindBy(name="uid")
		@CacheLookup
		WebElement txtusername;
		
		@FindBy(name="password")
		@CacheLookup
		WebElement txtpassword;
		
		@FindBy(name="btnLogin")
		@CacheLookup
		WebElement btnlogin;
		
		public void setusername(String uname)
		{
			txtusername.sendKeys(uname);
		}
		
		public void setpassword(String pwd)
		{
			txtpassword.sendKeys(pwd);
		}
		
		public void clicksubmit()
		{
			btnlogin.click();
		}
		
		
		
		
		
	

}
