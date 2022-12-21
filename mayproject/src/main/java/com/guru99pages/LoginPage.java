package com.guru99pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	@FindBy(name="uid")
	private WebElement userId;
	
	@FindBy(name="password")
	private WebElement userpassword;
	
	@FindBy(name="btnLogin")
	private WebElement loginButton;

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	public void logintoapplication(String username,String password)
	{
		elementcontrol.settext(userId, username);
		elementcontrol.settext(userpassword,password);
		elementcontrol.ClickElement(loginButton);
	}

}
