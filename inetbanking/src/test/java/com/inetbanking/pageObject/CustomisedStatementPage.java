package com.inetbanking.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomisedStatementPage {
	WebDriver driver;
	public CustomisedStatementPage(WebDriver d)
	{
		driver=d;
	}
	public void btn_customisedstatement()
	{
		WebElement customisedstatement=driver.findElement(By.linkText("Customised Statement"));
		customisedstatement.click();
	}
	public void enteraccountnumber(String acc)
	{
		WebElement accountnumber=driver.findElement(By.name("accountno"));
		accountnumber.sendKeys(acc);
	}
	public void enterfromdate(String date)
	{
		WebElement fromdater=driver.findElement(By.name("fdate"));
		fromdater.sendKeys(date);
	}
	public void entertodate(String date)
	{
		WebElement todater=driver.findElement(By.name("tdate"));
		todater.sendKeys(date);
	}
	public void enteramountlowerlimit(String amt)
	{
		WebElement amountlowerlimit=driver.findElement(By.name("amountlowerlimit"));
		amountlowerlimit.sendKeys(amt);
	}
	public void enternumtransaction(String txt)
	{
		WebElement numtransaction=driver.findElement(By.name("numtransaction"));
		numtransaction.sendKeys(txt);
	}
	public void btn_submit()
	{
		WebElement btn_submit=driver.findElement(By.name("AccSubmit"));
		btn_submit.click();
	}



}
