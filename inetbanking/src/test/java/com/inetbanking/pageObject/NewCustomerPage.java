package com.inetbanking.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewCustomerPage {
	WebDriver driver;
	public NewCustomerPage(WebDriver d)
	{
		driver=d;
	}
	
	public void newcustomer()
	{
	WebElement newcustomer=driver.findElement(By.linkText("New Customer"));
	newcustomer.click();
	
	}
	
	public void customername(String cname)
	{
		WebElement customername=driver.findElement(By.name("name"));
		customername.sendKeys(cname);
	}
	
	public void gender()
	{
		WebElement gender=driver.findElement(By.xpath("//input[@value='f']"));
		gender.click();
	}
	
	public void birthdate(String ddmmyyyy)
	{
		WebElement date=driver.findElement(By.xpath("//input[@type='date']"));
		date.sendKeys(ddmmyyyy);
	}
	

	public void adress(String adr)
	{
		WebElement adress=driver.findElement(By.name("addr"));
		adress.sendKeys(adr);
	}
	

	public void city(String city1)
	{
		WebElement city=driver.findElement(By.name("city"));
		city.sendKeys(city1);
	}
	
	public void state(String state1)
	{
		WebElement state=driver.findElement(By.name("state"));
		state.sendKeys(state1);
	}
	
	public void pin(String pin1)
	{
		WebElement pin=driver.findElement(By.name("pinno"));
		pin.sendKeys(pin1);
	} 
	
	public void mobilenumber(String mobnum)
	{
		WebElement mobilenumber=driver.findElement(By.name("telephoneno"));
		mobilenumber.sendKeys(mobnum);
	}
	
	public void emailid(String eid)
	{
		WebElement emailid=driver.findElement(By.name("emailid"));
		emailid.sendKeys(eid);
	}
	
	public void password(String pwd)
	{
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys(pwd);
	}
	
	public void btnsubmit()
	{
		WebElement submit=driver.findElement(By.name("sub"));
		submit.click();
	}
	
	
	
	
	
	
	

}
