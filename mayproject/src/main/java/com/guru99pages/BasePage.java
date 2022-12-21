package com.guru99pages;

import org.openqa.selenium.WebDriver;

import commanlibs.Implimentation.ElementControl;

public class BasePage {
	WebDriver driver;
	public ElementControl elementcontrol;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		elementcontrol=new ElementControl(driver);
	}

}
