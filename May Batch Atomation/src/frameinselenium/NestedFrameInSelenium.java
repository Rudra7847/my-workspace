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

public class NestedFrameInSelenium {
	WebDriver driver;
	String path="";
	String actual_brow_path="";
	String actual_file_path="";
	Properties p;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		NestedFrameInSelenium nf=new NestedFrameInSelenium();
		nf.setup();
		nf.test_nestedframe();

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
	public void test_nestedframe()
	{
		String base_url=p.getProperty("url4");
		driver.get(base_url);
		driver.switchTo().frame("frame1");
		WebElement child=driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(child);
		WebElement p_tag=driver.findElement(By.xpath("//p[contains(text(),'Child Iframe')]"));
		System.out.println(p_tag.getText());
		driver.switchTo().defaultContent();
		
		
	}

}
