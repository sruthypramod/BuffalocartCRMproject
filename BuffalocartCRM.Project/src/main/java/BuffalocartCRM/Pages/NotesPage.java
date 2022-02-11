package BuffalocartCRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BuffalocartCRM.Utilities.PageUtilities;


public class NotesPage {
	public WebDriver driver;
	PageUtilities obj1;
	
	@FindBy(xpath="//a[@href='http://buffalocart.com/demo/crm/index.php/notes']")
	WebElement notes;
	@FindBy(xpath="//a[@data-title='Manage labels']")
	WebElement manage;
	@FindBy(xpath="(//a[@title='Add note'])[2]")
	WebElement add;
	@FindBy(xpath="//a[@data-id='19']")
	WebElement alert;
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement search;
	@FindBy(xpath="//td[contains(.,'2022-01-29 03:32:08 am')]")
	WebElement todo;

	public NotesPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void notes()
	{
		obj1=new PageUtilities(driver);
		
	obj1.click(driver,notes);
	}
	
	public boolean search()
	{ 
		obj1=new PageUtilities(driver);
		
		search.sendKeys("to do");
		obj1.hitenter(driver,search);
	    return search.isDisplayed();
	}
	
	public boolean manage()
	{
		obj1=new PageUtilities(driver);
		obj1.waitForElementTobeVisible(driver,manage,50);
		return manage.isDisplayed();
	}
	public boolean add()
	{
	obj1=new PageUtilities(driver);
	obj1.waitForElementTobeVisible(driver, add,50);
	
		return add.isDisplayed();
	}
}
