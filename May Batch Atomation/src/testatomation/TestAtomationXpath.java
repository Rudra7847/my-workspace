package testatomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAtomationXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Relative xpath
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sonalibagadi@gmail.com");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456",Keys.ENTER);
		//Actual xpath
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input")).sendKeys("sonalibagadi@gmail.com");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div[2]/div/input")).sendKeys("123456",Keys.ENTER);
		

	}

}
