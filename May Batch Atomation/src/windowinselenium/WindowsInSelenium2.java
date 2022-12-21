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

public class WindowsInSelenium2 {
	WebDriver driver;
	String path="";
	String actual_brow_path="";
	String actual_file_path="";
	Properties p;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WindowsInSelenium2 w=new WindowsInSelenium2();
		w.setup();
		w.test_windows();

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
	public void test_windows() throws InterruptedException
	{
		String main_tab=driver.getWindowHandle();
		Thread.sleep(3000);
		driver.findElement(By.id("messageWindowButton")).click();
        Set<String> all_tab = driver.getWindowHandles();
        for(String x:all_tab)
        {
        	if(!x.equals(main_tab))
        	{
        		driver.switchTo().window(x);
        		WebElement y=driver.findElement(By.xpath("/html/body/text()"));
        		System.out.println(y.getClass());
        		Thread.sleep(3000);
        		driver.close();
        	}
        }
	}

}
