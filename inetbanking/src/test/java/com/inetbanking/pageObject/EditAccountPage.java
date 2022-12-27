package com.inetbanking.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditAccountPage {
	WebDriver driver;
	public EditAccountPage(WebDriver d)
	{
		driver=d;
	}
	
	public void btn_editaccount()
	{
		WebElement btn_editaccount=driver.findElement(By.linkText("Edit Account"));
		btn_editaccount.click();
	}
	
	public void Enter_customer_id(String account_No)
	{
		WebElement account_no=driver.findElement(By.name("accountno"));
		account_no.sendKeys(account_No);
	}
	
	
	public void btn_submit()
	{
		WebElement btn_submit=driver.findElement(By.name("AccSubmit"));
		btn_submit.click();
	}


}
