package com.inetbanking.testcases;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObject.BalanceEnquiryPage;
import com.inetbanking.pageObject.ChangePasswordPage;
import com.inetbanking.pageObject.CustomisedStatementPage;
import com.inetbanking.pageObject.DeleteAccountPage;
import com.inetbanking.pageObject.DeleteCustomerPage;
import com.inetbanking.pageObject.DepositAmountPage;
import com.inetbanking.pageObject.EditAccountPage;
import com.inetbanking.pageObject.EditCustomerPage;
import com.inetbanking.pageObject.FundTranferPage;
import com.inetbanking.pageObject.LogOutPage;
import com.inetbanking.pageObject.LoginPage1;
import com.inetbanking.pageObject.MiniStatementPage;
import com.inetbanking.pageObject.NewAccountPage;
import com.inetbanking.pageObject.NewCustomerPage;
import com.inetbanking.pageObject.WithdrawalAmountPage;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest(String username,String password)
	{
		driver.get(baseurl);
		
		LoginPage1 lp=new LoginPage1(driver);
		lp.setusername(username);
		lp.setpassword(password);
		lp.clicksubmit();
		
		String actual_title="Guru99 Bank Manager HomePage";
		String expected_title=driver.getTitle();
		Assert.assertEquals(actual_title,expected_title);
		
//		if(driver.getTitle().equals(" Guru99 Bank Manager HomePage "))
//		{
//			Assert.assertTrue(true);
//		}
//		else
//		{
//			Assert.assertTrue(false);
//		}
	}
	
	
	@Test(enabled=false)
	public void Newcustomer()
	{
		//driver.navigate().to("https://demo.guru99.com/V4/manager/addcustomerpage.php");
		NewCustomerPage nc=new NewCustomerPage(driver);
		nc.newcustomer();
		nc.customername(CustomerName);
		nc.gender();
		nc.birthdate(Date);
		nc.adress(Adress);
		nc.city(City);
		nc.state(State);
		nc.pin(PinNumber);
		nc.mobilenumber(MobileNumber);
		nc.emailid(Emailid);
		nc.password(Password);
		nc.btnsubmit();
	}
	
	@Test(enabled=false)
	public void EditCustomer()
	{
		EditCustomerPage ec=new EditCustomerPage(driver);
		ec.btn_editcustomer();
		ec.Enter_customer_id(CustomerId1);
		ec.btn_submit();
	}
	
	@Test(enabled=false)
	public void DeleteCustomer()
	{
		DeleteCustomerPage dc=new DeleteCustomerPage(driver);
		dc.btn_deletecustomer();
		dc.Enter_customer_id(CustomerId2);
		dc.btn_submit();
	}
	
	@Test(enabled=false)
	public void NewAccount()
	{
		NewAccountPage na=new NewAccountPage(driver);
		na.btn_newaccount();
		na.Enter_customer_id(CustomerId3);
		na.account_type();
		na.initial_deposit(Initial_Amount);
		na.btn_submit();
	}
	
	@Test(enabled=false)
	public void EditAccount()
	{
		EditAccountPage ea=new EditAccountPage(driver);
		ea.btn_editaccount();
		ea.Enter_customer_id(AccountNo);
		ea.btn_submit();
	}
	
	@Test(enabled=false)
	public void DeleteAccount()
	{
		DeleteAccountPage da=new DeleteAccountPage(driver);
		da.btn_deleteaccount();
		da.Enter_account_no(AccountNumber);
		da.btn_submit();
		driver.switchTo().alert().accept();
	}
	
	@Test(enabled=false)
	public void Deposite()
	{
		DepositAmountPage da=new DepositAmountPage(driver);
		da.btn_deposit_amount();
		da.enter_account_number(AccountNumber);
		da.enter_amount(Amount);
		da.description(Description);
		da.btn_submit();
				
	}
	
	@Test(enabled=false)
	public void withdrawal()
	{
		WithdrawalAmountPage wa=new WithdrawalAmountPage(driver);
		wa.btn_withdrawal_amount();
		wa.enter_account_number(AccountNumber);
		wa.enter_amount(Amount);
		wa.description(Description);
		wa.btn_submit();
				
	}
	@Test(enabled=false)
	public void Fundtransfer()
	{
		FundTranferPage ft=new FundTranferPage(driver);
		ft.btn_fundtransfer();
		ft.enterpayersaccountnumber(AccountNumber);
		ft.enterpayeessaccountnumber(AccountNo);
		ft.enteramount(Amount);
		ft.enterdescription(Description);
		ft.btn_submit();
				
	}
	
	@Test(enabled=false)
	public void ChangePassword()
	{
		ChangePasswordPage ft=new ChangePasswordPage(driver);
		ft.btn_changepassword();
		ft.enteroldpassword(Password);
		ft.enternewpassword(NewPassword);
		ft.enterconfirmpassword(NewPassword);
		
		ft.btn_submit();
				
	}
	
	@Test(enabled=false)
	public void BalanceEnquiry()
	{
		BalanceEnquiryPage be=new BalanceEnquiryPage(driver);
		be.btn_balanceenquiry();
		be.Enter_accountnumber(AccountNo);
		be.btn_submit();
	}
	
	@Test(enabled=false)
	public void MiniStatement()
	{
		MiniStatementPage be=new MiniStatementPage(driver);
		be.btn_MiniStatement();
		be.Enter_accountnumber(AccountNo);
		be.btn_submit();
	}
	
	@Test(enabled=false)
	public void CustomisedStatement()
	{
		CustomisedStatementPage cs=new CustomisedStatementPage(driver);
		cs.btn_customisedstatement();
		cs.enteraccountnumber(AccountNo);
		cs.enterfromdate(Date1);
		cs.entertodate(Date2);
		cs.enteramountlowerlimit(Amount);
		cs.enternumtransaction(txt);
		cs.btn_submit();
	}
	
	@Test(enabled=false)
	public void LogOut()
	{
		LogOutPage lo=new LogOutPage(driver);
		lo.btn_logout();
		driver.switchTo().alert().accept();
	}	
	
	

}
