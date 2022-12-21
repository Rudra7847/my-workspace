package frameinselenium;

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

public class FrameInSelenium {
	WebDriver driver;
	String path="";
	String actual_brow_path="";
	String actual_file_path="";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 FrameInSelenium f=new  FrameInSelenium ();
		 f.setup();
		 f.test_frame();

	}
	public void setup()
	{
		path=System.getProperty("user.dir");
		actual_brow_path=path+"\\driver\\chromedriver_win32\\chromedriver.exe";
		actual_file_path=path+"\\Resource\\Test.properties";
		System.setProperty("webdriver.chrome.driver", actual_brow_path);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	public void test_frame() throws IOException
	{
		File f=new File(actual_file_path);
		FileInputStream fin=new FileInputStream(f);
		Properties p=new Properties();
		p.load(fin);
		String base_url=p.getProperty("url1");
		driver.get(base_url);
		driver.switchTo().frame("frame1");
		WebElement h1_tag=driver.findElement(By.id("sampleHeading"));
		System.out.println(h1_tag.getText());
		driver.switchTo().defaultContent();
	}
	

}
