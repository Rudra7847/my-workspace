package com.guru99test;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.guru99pages.LoginPage;
import com.guru99pages.NewCustomerPage;

import commanlibs.Implimentation.CommonDriver;
import commanlibs.utilities.ConfigUtils;

public class BaseTest {
	CommonDriver cmnDriver;
	String url;
	LoginPage loginpage;
	String currentWorkingDirectory;
	String configfilename;
	Properties configproperty;
	String browserType;
	WebDriver driver;
	NewCustomerPage newcustomerpage;
	
  @BeforeSuite
  public void presetup() throws IOException 
  {
	  currentWorkingDirectory=System.getProperty("user.dir");
	  configfilename=currentWorkingDirectory+"\\config\\config.properties";
	  configproperty=ConfigUtils.readproperties(configfilename);
  }
  
  @BeforeClass
  public void setup() throws Exception
  {
	  url=configproperty.getProperty("Baseurl");
	  browserType=configproperty.getProperty("BrowserType");
	  cmnDriver=new CommonDriver(browserType);
	  driver=cmnDriver.getDriver();
	  loginpage=new LoginPage(driver);
	  cmnDriver.navigateToUrl(url);
	  
	  
	  
  }
  

  @AfterClass
  public void CloseDown()
  {
	  cmnDriver.Closebrowser();
  }
  @AfterMethod
  public void tekesscreenshot(ITestResult result)
  {
	 
  }
  
}
