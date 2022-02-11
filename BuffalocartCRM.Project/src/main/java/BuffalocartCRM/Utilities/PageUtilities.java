package BuffalocartCRM.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtilities {
	public WebDriver driver;
	public PageUtilities(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement waitForElementTobeVisible(WebDriver driver,WebElement elementToBeLoaded,int Time)
	{
		WebDriverWait wait=new WebDriverWait(driver,Time);
		WebElement element=wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
		return element;
	}
	public void implicitWait(WebDriver driver,int Time)
	{
	driver.manage().timeouts().implicitlyWait(Time,TimeUnit.SECONDS);
	}

	
	public WebElement waitForElementTobeClickable(WebDriver driver,WebElement elementToBeLoaded,int Time)
	{
		WebDriverWait wait=new WebDriverWait(driver,Time);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(elementToBeLoaded));
		return element;
	}
	public Alert waitForAlert(WebDriver driver,int Time)
	{
		WebDriverWait wait=new WebDriverWait(driver,Time);
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		
		return alert ;
	}
	public void hitenter(WebDriver driver,WebElement element)
	{
		//retrieve webelement to perform mouse hover
		element.sendKeys(Keys.ENTER);
	}
	
	
	public void sendTestUsingMouseActions(WebDriver driver,WebElement element,String text)
	{
		//retrieve webelement to perform mouse hover
		Actions action=new Actions(driver);
		action.sendKeys(element,text).build().perform();
	}
	public void moveToElement(WebDriver driver,WebElement element)
	{Actions action=new Actions(driver);
	action.moveToElement(element).build().perform();
}
	public void contextclick(WebDriver driver,WebElement element)
	{
		Actions action=new Actions(driver);
		action.moveToElement(element).contextClick().build().perform();
	}
	public void click(WebDriver driver,WebElement element)
	{
		Actions action=new Actions(driver);
		action.moveToElement(element).click().build().perform();
	}
	public void scrollingup(WebDriver driver)
	{
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	  
	 
	 jse.executeScript("window.scrollBy(0,1500);");//scrolldown
}
}
