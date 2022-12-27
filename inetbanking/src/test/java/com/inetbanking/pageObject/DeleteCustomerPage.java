package com.inetbanking.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteCustomerPage {
	WebDriver driver;
	public DeleteCustomerPage(WebDriver d)
	{
		driver=d;
	}
	
	public void btn_deletecustomer()
	{
		WebElement btn_deletecustomer=driver.findElement(By.linkText("Delete Customer"));
		btn_deletecustomer.click();
	}
	
	public void Enter_customer_id(String cust_id)
	{
		WebElement customer_id=driver.findElement(By.name("cusid"));
		customer_id.sendKeys(cust_id);
	}
	
	
	public void btn_submit()
	{
		WebElement btn_submit=driver.findElement(By.name("AccSubmit"));
		btn_submit.click();
	}


}
