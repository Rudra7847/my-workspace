package testatomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		WebElement option1=driver.findElement(By.id("vfb-7-1"));
		System.out.println(option1.getAttribute("value"));
		Thread.sleep(3000);
		option1.click();
		
		
		System.out.println("option1:"+option1.isSelected());
		

		WebElement option2=driver.findElement(By.id("vfb-7-2"));
		System.out.println(option2.getAttribute("value"));
		Thread.sleep(3000);
		option2.click();
		
		System.out.println("option1:"+option1.isSelected());
		System.out.println("option2:"+option2.isSelected());
		

		WebElement option3=driver.findElement(By.id("vfb-7-3"));
		System.out.println(option3.getAttribute("value"));
		Thread.sleep(3000);
		option3.click();
		
		System.out.println(driver.getTitle());
		
		System.out.println("option1:"+option1.isSelected());
		System.out.println("option2:"+option2.isSelected());
		System.out.println("option3:"+option3.isSelected());

	}

}
