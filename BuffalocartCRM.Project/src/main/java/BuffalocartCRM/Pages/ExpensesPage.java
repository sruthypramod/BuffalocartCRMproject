package BuffalocartCRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BuffalocartCRM.Utilities.PageUtilities;

public class ExpensesPage {
	public WebDriver driver;
	PageUtilities obj;
	@FindBy(xpath="//a[@href='http://buffalocart.com/demo/crm/index.php/expenses']")
	WebElement expe;
	@FindBy(xpath="//a[@id='monthly-expenses-button']")
	WebElement mon;
	@FindBy(xpath="//a[@data-bs-target='#yearly-expenses']")
	WebElement year;
	@FindBy(xpath="//a[contains(.,'Custom')]")
	WebElement cus;
	@FindBy(xpath="//a[contains(.,'Recurring')]")
	WebElement rec;
	@FindBy(xpath="//a[contains(.,'Summary')]")
	WebElement sum;
	@FindBy(xpath="//a[contains(.,'Chart')]")
	WebElement chart;
	public ExpensesPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void expenses()
	{
		
		obj=new PageUtilities(driver);
		obj.waitForElementTobeClickable(driver, expe,60);
		
	}
	public boolean month()
	{
		return  mon.isDisplayed();
	}
public boolean year()
{
	return year.isDisplayed();
}
public boolean custom()
{
	return cus.isDisplayed();
}
public boolean recurring()
{
	return rec.isDisplayed();
}
public boolean summary()
{
	return sum.isDisplayed();
}
public boolean chart()
{
	return chart.isDisplayed();
}
}
