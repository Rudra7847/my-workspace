package testatomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitInSelenium {
	WebDriver driver;
	String path="";
	String Actual_path="";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExplicitWaitInSelenium e=new ExplicitWaitInSelenium();
		e.setup();
		e.test_Explicitwait();
		

	}
	public void setup()
	{
		path=System.getProperty("user.dir");
		Actual_path=path+"\\driver\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Actual_path);
		driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dynamic-properties");
	}
	public void test_Explicitwait()
	{
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(2));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
		
		WebElement btn_visible=driver.findElement(By.id("visibleAfter"));
		System.out.println(btn_visible.getText());
	}

}
