package testatomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAtomationLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement atag=driver.findElement(By.tagName("h2"));
		System.out.println(atag.getText());
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.partialLinkText("/account/login?signup=true")).click();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.partialLinkText("passsword?")).click();
		

	}

}
