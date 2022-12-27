package com.inetbanking.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChangePasswordPage {
	WebDriver driver;
	public ChangePasswordPage(WebDriver d)
	{
		driver=d;
	}

	public void btn_changepassword()
	{
		WebElement changepassword=driver.findElement(By.linkText("Change Password"));
		changepassword.click();
		
	}
	
	public void enteroldpassword(String pwd )
	{
		WebElement oldpassword=driver.findElement(By.name("oldpassword"));
		oldpassword.sendKeys(pwd);
		
	}
	

	public void enternewpassword(String pwd )
	{
		WebElement newpassword=driver.findElement(By.name("newpassword"));
		newpassword.sendKeys(pwd);
		
	}
	
	public void enterconfirmpassword(String pwd )
	{
		WebElement confirmpassword=driver.findElement(By.name("confirmpassword"));
		confirmpassword.sendKeys(pwd);
		
	}
	public void btn_submit()
	{
		WebElement btn_submit=driver.findElement(By.name("sub"));
		btn_submit.click();
	}


}
