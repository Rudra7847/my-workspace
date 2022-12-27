package com.inetbanking.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewAccountPage {
	WebDriver driver;
	public NewAccountPage(WebDriver d)
	{
		driver=d;
	}
	
	public void btn_newaccount()
	{
		WebElement btn_newaccount=driver.findElement(By.linkText("New Account"));
		 btn_newaccount.click();
	}
	
	public void Enter_customer_id(String cust_id)
	{
		WebElement customer_id=driver.findElement(By.name("cusid"));
		customer_id.sendKeys(cust_id);
	}
	
	public void account_type()
	{
		WebElement sel_account=driver.findElement(By.name("selaccount"));
		Select select_account=new Select(sel_account);
		select_account.selectByValue("Savings");
	}
	
	
	public void initial_deposit(String amt)
	{
		WebElement initial_amount=driver.findElement(By.name("inideposit"));
		initial_amount.sendKeys(amt);
	
	}
	
	public void btn_submit()
	{
		WebElement btn_submit=driver.findElement(By.name("button2"));
		btn_submit.click();
	}




}
