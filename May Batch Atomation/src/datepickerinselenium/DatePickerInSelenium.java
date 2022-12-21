package datepickerinselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerInSelenium {
	WebDriver driver;
	String path="";
	String actual_path="";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 DatePickerInSelenium d=new  DatePickerInSelenium();
		 d.setup();
		 d.test_datepicker();

	}
	public void setup()
	{
		path=System.getProperty("user.dir");
		actual_path=path+"\\driver\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actual_path);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/date-picker");
	}
	public void test_datepicker() throws InterruptedException
	{
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		Thread.sleep(3000);
		WebElement select_month=driver.findElement(By.className("react-datepicker__month-select"));
		Select sel_month=new Select(select_month);
		sel_month.selectByVisibleText("November");
		Thread.sleep(3000);
		WebElement select_year=driver.findElement(By.className("react-datepicker__year-select"));
		Select sel_year=new Select(select_year);
		sel_year.selectByValue("1993");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@aria-label='Choose Saturday, November 6th, 1993']")).click();
	}

}
