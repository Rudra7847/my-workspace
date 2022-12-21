package actionclassinselenium;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassInSelenium {
	WebDriver driver;
	String path="";
	String actual_brow_path="";
	String actual_file_path="";
	Properties p;
	Actions a1;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ActionClassInSelenium a=new ActionClassInSelenium();
		a.setup();
		a.test_action();
		a.test_drag_drop();

	}
	public void setup() throws IOException
	{
		path=System.getProperty("user.dir");
		actual_brow_path=path+"\\driver\\chromedriver_win32\\chromedriver.exe";
		actual_file_path=path+"\\Resource\\Test.properties";
		System.setProperty("webdriver.chrome.driver", actual_brow_path);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		File f=new File(actual_file_path);
		FileInputStream fin=new FileInputStream(f);
		p=new Properties();
		p.load(fin);
		
	}
	
	public void test_action() throws InterruptedException
	{
		String base_url=p.getProperty("url");
		driver.get(base_url);
		WebElement btn_click=driver.findElement(By.xpath("//button[starts-with(text(),'Click Me')]"));
		a1=new Actions(driver);
		a1.moveToElement(btn_click).click().build().perform();
		Thread.sleep(3000);
		WebElement btn_right_click=driver.findElement(By.id("rightClickBtn"));
		a1.moveToElement(btn_right_click).contextClick().build().perform();
		Thread.sleep(3000);
		WebElement btn_double_click=driver.findElement(By.id("doubleClickBtn"));
		a1.moveToElement(btn_double_click).doubleClick().build().perform();
	}
	public void test_drag_drop() throws InterruptedException
	{
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement drag_bank=driver.findElement(By.id("credit2"));
		WebElement drop_bank=driver.findElement(By.id("bank"));
		Thread.sleep(3000);
		a1.dragAndDrop(drag_bank, drop_bank).build().perform();
		
		WebElement drag_amount=driver.findElement(By.id("fourth"));
		WebElement Drop_amount=driver.findElement(By.id("amt7"));
		Thread.sleep(3000);
		a1.dragAndDrop(drag_amount, Drop_amount).build().perform();
		
		WebElement drag_loan=driver.findElement(By.id("credit4"));
		WebElement drop_loan=driver.findElement(By.id("loan"));
		Thread.sleep(3000);
		a1.dragAndDrop(drag_loan, drop_loan).build().perform();
		
		WebElement drag_amount1=driver.findElement(By.id("credit"));
		WebElement Drop_amount1=driver.findElement(By.id("amt8"));
		Thread.sleep(3000);
		a1.dragAndDrop(drag_amount1, Drop_amount1).build().perform();
		WebElement drag_sales=driver.findElement(By.id("credit1"));
		WebElement drop_sales=driver.findElement(By.id("bank"));
		Thread.sleep(3000);
		a1.dragAndDrop(drag_sales, drop_sales).build().perform();
		
		WebElement drag_amount2=driver.findElement(By.id("credit1"));
		WebElement Drop_amount2=driver.findElement(By.id("amt7"));
		Thread.sleep(3000);
		a1.dragAndDrop(drag_amount2, Drop_amount2).build().perform();
		
		
	}
	
	

}
