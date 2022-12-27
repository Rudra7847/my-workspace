package com.inetbanking.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MiniStatementPage {
	WebDriver driver;
	public MiniStatementPage(WebDriver d)
	{
		driver=d;
	}
	
	public void btn_MiniStatement()
	{
		WebElement MiniStatement=driver.findElement(By.linkText("Mini Statement"));
		MiniStatement.click();
	}
	
	public void Enter_accountnumber(String account_No)
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
