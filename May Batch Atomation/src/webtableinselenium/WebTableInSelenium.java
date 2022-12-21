package webtableinselenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableInSelenium {
	WebDriver driver;
	String path="";
	String actual_brow_path="";
	String actual_file_path="";
	Properties p;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebTableInSelenium wt=new WebTableInSelenium();
		wt.setup();
		wt.test_table();

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
	public void test_table()
	{
		String base_url=p.getProperty("url2");
		driver.get(base_url);
		List<WebElement> complete_table = driver.findElements(By.xpath("//table[@Class='datatable']//tbody//tr"));
		for(WebElement x:complete_table)
		{
			String company_name=x.findElement(By.xpath("td[1]")).getText();
			if(company_name.contains("Ltd"))
			{
			String current_price=x.findElement(By.xpath("td[4]")).getText();
			System.out.println(company_name + "-" + current_price);
			}
		}
	}

}
