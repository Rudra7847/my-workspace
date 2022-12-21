package commanlibs.Implimentation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonDriver {
	private WebDriver driver;
	

    private int elementDetectionTime;
	private String CurrentWorkingDirectory;
	 public CommonDriver( String browserType) throws Exception
	 {
		 if(browserType.equalsIgnoreCase("chrome"))
		 {
			 WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		 }
		 
		 else if(browserType.equalsIgnoreCase("edge"))
		 {
			 WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
		 }
		 
		 else 

		 {
			throw new Exception("Invalid browser Type"+browserType);
		 }
		 
		 driver.manage().window().maximize();
	 }
	 
		public void navigateToUrl( String url)
		{
			 driver.get(url);
		}
		public WebDriver getDriver() {
			return driver;
		}

		public void setElementDetectionTime(int elementDetectionTime) {
			this.elementDetectionTime = elementDetectionTime;
		}
		public void Closebrowser()
		{
			driver.close();
		}
		public void CloseAllbrowser()
		{
			driver.quit();
		}
		
		public String getTitleOfWebPage()
		{
			return driver.getTitle();
		}

	

		 
	 
	 

}
