package robotclassinselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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

public class FileUploadUsingRobot {
	WebDriver driver;
	String path="";
	String actual_brow_path="";
	String actual_file_path="";
	Properties p;

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		// TODO Auto-generated method stub
		 FileUploadUsingRobot s=new  FileUploadUsingRobot();
		 s.setup();
		 s.test_uploadfile();

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
		String base_url=p.getProperty("url3");
		driver.get(base_url);
	}
	public void test_uploadfile() throws InterruptedException, AWTException
	{
		WebElement input_click=driver.findElement(By.id("uploadfile_0"));
		Actions a=new Actions(driver);
		a.moveToElement(input_click).click().build().perform();
		Thread.sleep(3000);
		
		String actual_file_path1=path+"\\Resource\\Test.properties";
		StringSelection str=new StringSelection(actual_file_path1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		
		
	}

}
