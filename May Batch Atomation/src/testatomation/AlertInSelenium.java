package testatomation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertInSelenium {
	WebDriver driver;
	String path="";
	String actual_path="";
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		AlertInSelenium a=new AlertInSelenium();
		a.setup();
		a.test_alert();
		
		
		

	}
	public void setup()
	{
		path=System.getProperty("user.dir");
		actual_path=path+"\\driver\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actual_path);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	public void test_alert() throws InterruptedException
	{
		driver.get("https://demoqa.com/alerts");
		WebElement btn_alert=driver.findElement(By.id("alertButton"));
		btn_alert.click();
		
		Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
		WebElement btn_timer_alert=driver.findElement(By.id("timerAlertButton"));
		btn_timer_alert.click();
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.alertIsPresent());
		
		Thread.sleep(3000);
		alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		WebElement btn_confirm_alert=driver.findElement(By.id("confirmButton"));
		btn_confirm_alert.click();
		
		Thread.sleep(3000);
		alt=driver.switchTo().alert();
		//alt.accept();
		
		//WebElement btn_confirm_text=driver.findElement(By.id("confirmResult"));
		//System.out.println(btn_confirm_text.getText());
		alt.dismiss();
		WebElement btn_confirm_text=driver.findElement(By.id("confirmResult"));
		System.out.println(btn_confirm_text.getText());
		
		WebElement btn_promt=driver.findElement(By.id("promtButton"));
		btn_promt.click();
		
		Thread.sleep(3000);
		alt=driver.switchTo().alert();
		alt.sendKeys("vinu1234");
		alt.accept();
		
		WebElement btn_promt_text=driver.findElement(By.id("promptResult"));
		System.out.println(btn_promt_text.getText());
	}

}
