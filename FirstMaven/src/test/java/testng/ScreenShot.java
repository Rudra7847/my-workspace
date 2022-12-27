package testng;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ScreenShot {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider="testdata")
	public void login(String uname,String pwd)
	{
		driver.get("https://demo.guru99.com/V4/index.php");
		WebElement username=driver.findElement(By.name("uid"));
		username.sendKeys(uname);
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys(pwd);
		WebElement btn_submit=driver.findElement(By.name("btnLogin"));
		btn_submit.click();
		String actual_title="Guru99 Bank Manager HomePage";
		String Expected_title=driver.getTitle();
		Assert.assertEquals(actual_title,Expected_title);
	}
	
	@DataProvider
	public Object[][] testdata()
	{
		return new Object[][] {{"mngr452260","qYvymyn"},{"abcd123456","poiuyt"}};
	}
	
	
	@AfterMethod
	  public void onTestFailure(ITestResult result) throws IOException
	  {
		  String path=System.getProperty("user.dir");
		  String actual_path=path+"\\Screenshot\\";
		  
		  Date d=new Date();
		  SimpleDateFormat sd=new SimpleDateFormat("MM-dd-yyyy HH-mm-ss");
		  
		  if(ITestResult.FAILURE==result.getStatus())
		  {
			  File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  FileUtils.copyFile(scr, new File(actual_path+"Test0215 "+sd.format(d)+".png"));
		  }
	  }  

	
	@AfterTest
	public void close()
	{
		driver.close();
	}

}
