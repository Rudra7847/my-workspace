package com.guru99test;

import org.testng.annotations.Test;

public class NewCustomerTest extends BaseTest {
	String customername=configproperty.getProperty("CustomerName");
	String date=configproperty.getProperty("DateOfBirth");
	String adress=configproperty.getProperty("Adress");
	String city=configproperty.getProperty("City");
	String state=configproperty.getProperty("State");
	String pincode=configproperty.getProperty("Pincode");
	String mobilenumber=configproperty.getProperty("Mobilenumber");
	String email=configproperty.getProperty("Email");
	String password=configproperty.getProperty("Password");
	
	@Test
	public void CreateNewCustomer(
			String date,
			String adress,
			String city,
			String state,
			String pincode,
			String mobilenumber,
			String email,
			String password)
	{
		newcustomerpage.CreateNewCustomer(customername,date,adress, city, state,pincode, mobilenumber,email,password);
				
	}

}
