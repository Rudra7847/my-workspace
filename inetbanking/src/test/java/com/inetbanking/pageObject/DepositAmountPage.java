package com.inetbanking.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DepositAmountPage {
	WebDriver driver;
	public DepositAmountPage(WebDriver d)
	{
		driver=d;
	}
	
	public void btn_deposit_amount()
	{
		WebElement deposit=driver.findElement(By.linkText("Deposit"));
		deposit.click();
	}
	
	public void enter_account_number(String accno)
	{
		WebElement account_number=driver.findElement(By.name("accountno"));
		account_number.sendKeys(accno);
	}
	
	public void enter_amount(String amt)
	{
		WebElement amount=driver.findElement(By.name("ammount"));
		amount.sendKeys(amt);
	}
	
	public void description(String dsr)
	{
		WebElement dsption=driver.findElement(By.name("desc"));
		dsption.sendKeys(dsr);
	}
	
	public void btn_submit()
	{
		WebElement btn_submit=driver.findElement(By.name("AccSubmit"));
		btn_submit.click();
	}

	

}
