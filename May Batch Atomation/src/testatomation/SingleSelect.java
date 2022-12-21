package testatomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {
	WebDriver driver;
	String path="";
	String Actual_path="";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SingleSelect s=new SingleSelect();
		s.setup();
		s.test_dropdown();

	}
	public void setup()
	{
		path=System.getProperty("user.dir");
		System.out.println(path);
		Actual_path=path+"\\driver\\chromedriver_win32\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", Actual_path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
	}
	public void test_dropdown() throws InterruptedException
	{
		System.out.println(driver.getTitle());
		WebElement sel_tag=driver.findElement(By.name("country"));
		Select s= new Select(sel_tag);
		Thread.sleep(3000);
		s.selectByIndex(0);
		
		Thread.sleep(3000);
		s.selectByValue("AZERBAIJAN");
		
		Thread.sleep(3000);
		s.selectByVisibleText("BRAZIL");
		System.out.println(s.isMultiple());
	
	}

}
