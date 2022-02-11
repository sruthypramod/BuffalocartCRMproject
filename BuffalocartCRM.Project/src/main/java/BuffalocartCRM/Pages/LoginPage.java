package BuffalocartCRM.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BuffalocartCRM.Utilities.PageUtilities;


public class LoginPage {
	public WebDriver driver;
	PageUtilities obj;
	@FindBy(xpath="//input[@name='email']")
	WebElement username;
	
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	@FindBy(xpath="//button[contains(.,'Sign in')]")
	WebElement signin;

public LoginPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public  void setUsername(String StrUsername)  
{
obj=new PageUtilities(driver);
obj.waitForElementTobeVisible(driver,username,60);
	username.sendKeys(StrUsername);
	
}
public void setPassword(String pass) 

{
	

	password.sendKeys(pass);
	
}
public void clearData()
{
	username.clear();
	password.clear();
}
public void signIn() 
{
	obj=new PageUtilities(driver);
obj.click(driver,signin);
	
}

public String getHomePageTitle()
{
	String title=driver.getTitle();
	return title;
}


}
