package com.inetbanking.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogOutPage {
	WebDriver driver;
	public LogOutPage(WebDriver d)
	{
		driver=d;
	}
	
	public void btn_logout()
	{
		WebElement btn_logout=driver.findElement(By.linkText("Log out"));
		btn_logout.click();
	}
	

}
