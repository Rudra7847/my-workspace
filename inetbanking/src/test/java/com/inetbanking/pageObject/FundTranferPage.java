package com.inetbanking.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FundTranferPage {
	WebDriver driver;
	public FundTranferPage(WebDriver d)
	{
		driver=d;
	}
	
	public void btn_fundtransfer()
	{
		WebElement fundtransfer=driver.findElement(By.linkText("Fund Transfer"));
		fundtransfer.click();
		
	}
	
	public void enterpayersaccountnumber(String pay_acc_num)
	{
		WebElement payersaccountnumber=driver.findElement(By.name("payersaccount"));
		payersaccountnumber.sendKeys(pay_acc_num);
		
	}
	
	public void enterpayeessaccountnumber(String payees_acc_num)
	{
		WebElement payeessaccountnumber=driver.findElement(By.name("payeeaccount"));
		payeessaccountnumber.sendKeys(payees_acc_num);
		
	}
	
	public void enteramount(String amt )
	{
		WebElement amount=driver.findElement(By.name("ammount"));
		amount.sendKeys(amt);
		
	}
	
	public void enterdescription(String desc )
	{
		WebElement description=driver.findElement(By.name("desc"));
		description.sendKeys(desc);
		
	}
	public void btn_submit()
	{
		WebElement btn_submit=driver.findElement(By.name("AccSubmit"));
		btn_submit.click();
	}

	
	

}
