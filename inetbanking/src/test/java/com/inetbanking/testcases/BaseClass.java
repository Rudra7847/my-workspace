package com.inetbanking.testcases;
import org.testng.*;

import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public String baseurl="https://demo.guru99.com/V4/index.php";
	public String username="mngr452260";
	public String password="qYvymyn";
	public static WebDriver driver;
	public String path="";
	public String actual_brow_path="";
	public String CustomerName="sonu vinayak bagadi";
	public String Adress="rukadiwadi tal hatkanagale";
	public String City="kolhapur";
	public String State="maharashtra";
	public String PinNumber="416118";
	public String MobileNumber="8975803053";
	public String Emailid ="vinayakbagadi54@gmail.com";
	public String Password="7847@vinu";
	public String Date="06111993";
	public String CustomerId1="74777";
	public String CustomerId2="4020";
	public String CustomerId3="74777";
	//public String CustomerId4="54060";
	public String Initial_Amount="5000";
	public String AccountNo="113475";
	public String AccountNumber="113476";
	public String Amount="500";
	public String Description="for loan";
	public String NewPassword="7847@sonu";
	public String Date1="06112022";
	public String Date2="10112022";
	public String txt="2";
	@BeforeClass
	public void setup()
	{
		//path=System.getProperty("user.dir");
		//actual_brow_path=path+"\\drivers\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", actual_brow_path);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
//	@AfterClass
//	public void TearDown()
//	{
//		driver.quit();
//	}

}
