package BuffalocartCRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BuffalocartCRM.Utilities.PageUtilities;

public class DashBoardPage {
	public WebDriver driver;
	PageUtilities ob;
	@FindBy(xpath="//span[contains(.,'Dashboard')]")
	WebElement dashboard;
	@FindBy(xpath="//div[@class='widget-icon bg-info']")
	WebElement test;
	@FindBy(xpath="//div[@class='widget-icon bg-primary']")
			WebElement newpost;
	@FindBy(xpath="//div[@class='widget-icon bg-success']")
	WebElement event;
	public DashBoardPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void dashBoard()
	{
		dashboard.click();
		ob=new PageUtilities(driver);
		ob.scrollingup(driver);
	}
	public void testPage()
	{
		
		test.click();

	}
	public void posts()
	{
	
	newpost.click();
		
		
	}
	public void event()
	{
		event.click();
	}

}
