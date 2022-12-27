package com.inetbanking.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteAccountPage {
	WebDriver driver;
	public DeleteAccountPage(WebDriver d)
	{
		driver=d;
	}
	
	public void btn_deleteaccount()
	{
		WebElement btn_deleteaccount=driver.findElement(By.linkText("Delete Account"));
		btn_deleteaccount.click();
	}
	
	public void Enter_account_no(String acc_no)
	{
		WebElement account_no=driver.findElement(By.name("accountno"));
		account_no.sendKeys(acc_no);
	}
	
	
	public void btn_submit()
	{
		WebElement btn_submit=driver.findElement(By.name("AccSubmit"));
		btn_submit.click();
	}


}
