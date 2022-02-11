package BuffalocartCRM.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class WaitUtilities {
	public WebDriver driver;
	public WaitUtilities(WebDriver driver)
	{
		this.driver=driver;
	}
	public void implicitWait(WebDriver driver,int Time)
	{
	driver.manage().timeouts().implicitlyWait(Time,TimeUnit.SECONDS);
	}

}
