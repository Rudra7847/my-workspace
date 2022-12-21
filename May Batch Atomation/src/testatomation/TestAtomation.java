package testatomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAtomation {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("8975803053");
		driver.findElement(By.id("pass")).sendKeys("rudra@7847");
		driver.findElement(By.name("login")).click();
		driver.get("https://msbte.org.in/");
		driver.findElement(By.partialLinkText("Institutes")).click();

	}

}
