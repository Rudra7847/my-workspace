package testatomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitInSelenium {
	WebDriver driver;
	String path="";
	String Actual_path="";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ImplicitWaitInSelenium i=new ImplicitWaitInSelenium ();
		i.setup();
		i.test_implicitwait();

	}
	public void setup()
	{
		path=System.getProperty("user.dir");
		Actual_path=path+"\\driver\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Actual_path);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dynamic-properties");
		
	}
	public void test_implicitwait() throws InterruptedException
	{
		WebElement btn_visible=driver.findElement(By.id("visibleAfter"));
		System.out.println(btn_visible.getText());
	}

}
