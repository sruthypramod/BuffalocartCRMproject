package BuffalocartCRM.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BuffalocartCRM.Utilities.PageUtilities;

public class EventPage {
	public WebDriver driver;
	PageUtilities objpage;
	@FindBy(xpath="//span[contains(text(),'Events')]")
	WebElement event;
	@FindBy(xpath="//span[contains(.,'Leads')]")
	WebElement leads;
	@FindBy(xpath="(//button[@aria-label='Close'])[1]")
	WebElement close;
	@FindBy(xpath="//a[@title='Manage labels']")
	WebElement manage;
	@FindBy(xpath="//button[@class='btn btn-default']")
	WebElement close1;
	@FindBy(xpath="//a[@class='btn btn-default add-btn']")
	WebElement addelement;
	@FindBy(xpath="//input[@id='only_me']")
	WebElement radio;
	
	public EventPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void events()
	{
		objpage=new PageUtilities(driver);
		objpage.waitForElementTobeClickable(driver,event,40);
		
	}
	public boolean manageLabels()
	{
		
		return manage.isDisplayed();
	
	}
	
	
	public boolean addEvent()
	{

return addelement.isDisplayed();
		
		
	}
	
	
	

}
