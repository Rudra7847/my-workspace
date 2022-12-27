package com.inetbanking.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditCustomerPage {
	WebDriver driver;
	public EditCustomerPage(WebDriver d)
	{
		driver=d;
	}
	
	public void btn_editcustomer()
	{
		WebElement btn_editcustomer=driver.findElement(By.linkText("Edit Customer"));
		btn_editcustomer.click();
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
