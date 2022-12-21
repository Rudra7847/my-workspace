package commanlibs.Implimentation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementControl {
	WebDriver driver;
	public ElementControl(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void ClickElement(WebElement element)
	{
		element.click();
	}
	
	public void ClearElement(WebElement element)
	{
		element.clear();
	}
	public void settext(WebElement element,String text)
	{
		element.sendKeys(text);
	}
	public boolean isselected(WebElement element)
	{
		return element.isSelected();
	}
	public void acceptalert()
	{
		driver.switchTo().alert().accept();
	}
	public String gettextfromalert()
	{
		return driver.switchTo().alert().getText();
	}


}
