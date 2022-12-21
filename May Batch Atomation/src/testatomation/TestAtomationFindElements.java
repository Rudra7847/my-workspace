package testatomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAtomationFindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://naukri.com/");
		List<WebElement> x=driver.findElements(By.tagName("a"));
		System.out.println(x.size());
		
		for(WebElement y:x)
		{
			System.out.println(y.getText()+" : "+y.getAttribute("href"));
		}
		

	}

}
