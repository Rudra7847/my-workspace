package windowinselenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabInSelenium {
	WebDriver driver;
	String path="";
	String actual_brow_path="";
	String actual_file_path="";
	Properties p;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		TabInSelenium t=new TabInSelenium();
		t.setup();
		t.test_tabs();
		

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
		String base_url=p.getProperty("url5");
		driver.get(base_url);
		
	}
	public void test_tabs() throws InterruptedException
	{
		String main_tab=driver.getWindowHandle();
		Thread.sleep(3000);
		driver.findElement(By.id("tabButton")).click();
		Set<String> all_tabs = driver.getWindowHandles();
		for(String x:all_tabs)
		{
			if(!x.equals(main_tab))
			{
				driver.switchTo().window(x);
				WebElement y=driver.findElement(By.id("sampleHeading"));
				System.out.println(y.getText());
				Thread.sleep(3000);
				//driver.close();
				driver.quit();
			}
		}
	}

}
