package BuffalocartCRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BuffalocartCRM.Utilities.PageUtilities;

public class TaskPage {
	WebDriver driver;
	PageUtilities obj;
	@FindBy(xpath="//span[contains(.,'Tasks')]")
	WebElement task;
	
	
	@FindBy(xpath="//a[@class='btn btn-default'][1]")
	WebElement addmultiple;
	@FindBy(xpath="(//a[@title='Add task'])[2]")
	WebElement close;
	@FindBy(xpath="//a[contains(.,'Kanban')]")
	WebElement kanban;
	@FindBy(xpath="//a[contains(.,'Gantt')]")
	WebElement gantt;
	public TaskPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	public void taskPage()
	{
		
		task.click();
		}
	
	
	public String addMultipleTask()
	{
		return addmultiple.getText();
	}
	
	public boolean kanban()
	{

		return kanban.isDisplayed();
	}
	public boolean gantt()
	{

		return gantt.isDisplayed();
	}

}
