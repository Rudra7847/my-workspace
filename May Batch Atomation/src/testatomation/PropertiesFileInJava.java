package testatomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFileInJava {
	WebDriver driver;
	String path="";
	String actual_brow_path="";
	String actual_file_path="";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 PropertiesFileInJava s=new  PropertiesFileInJava();
		 s.setup();
		

	}
	public void setup() throws IOException
	{
		path=System.getProperty("user.dir");
		actual_brow_path=path+"\\driver\\chromedriver_win32\\chromedriver.exe";
		actual_file_path=path+"\\Resource\\Test.properties";
		System.setProperty("webdriver.chrome.driver", actual_brow_path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		File f=new File(actual_file_path);
		FileInputStream fin=new FileInputStream(f);
		Properties p=new Properties();
		p.load(fin);
		String base_url=p.getProperty("url");
		driver.get(base_url);
	}

}
