package com.guru99pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerPage extends BasePage {
	

	@FindBy(linkText="New Customer")
	private WebElement Newcustomerbtn;
	
	@FindBy(name="name")
	private WebElement Customername;
	
	@FindBy(xpath="//input[@value='m']")
	private WebElement Gender;
	
	@FindBy(xpath="//input[@type='date']")
	private WebElement Dateofbirth;
	
	@FindBy(name="addr")
	private WebElement Adress;
	
	@FindBy(name="city")
	private WebElement City;
	
	@FindBy(name="state")
	private WebElement State;
	
	@FindBy(name="pinno")
	private WebElement Pincode;
	
	@FindBy(name="telephoneno")
	private WebElement Mobilenumber;
	
	@FindBy(name="emailid")
	private WebElement Emailid;
	
	@FindBy(name="password")
	private WebElement Password;
	
	@FindBy(name="sub")
	private WebElement Submit;
	
	public NewCustomerPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void CreateNewCustomer(String customername,
			String date,
			String adress,
			String city,
			String state,
			String pincode,
			String mobilenumber,
			String email,
			String password)
	{
		elementcontrol.ClickElement(Newcustomerbtn);
		elementcontrol.settext(Customername,customername );
		elementcontrol.ClickElement(Gender);
		elementcontrol.settext(Dateofbirth, date);
		elementcontrol.settext(Adress, adress);
		elementcontrol.settext(City, city);
		elementcontrol.settext(State,state);
		elementcontrol.settext(Pincode, pincode);
		elementcontrol.settext(Mobilenumber, mobilenumber);
		elementcontrol.settext(Emailid, email);
		elementcontrol.settext(Password, password);
		elementcontrol.ClickElement(Submit);
	}



}
