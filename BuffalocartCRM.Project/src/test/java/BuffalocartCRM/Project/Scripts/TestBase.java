package BuffalocartCRM.Project.Scripts;

import org.testng.annotations.Test;

import BuffalocartCRM.Constants.Constats;
import BuffalocartCRM.Utilities.PageUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class TestBase {
	public static Properties prop=null;
	public static WebDriver driver;
	public PageUtilities obj;
  @Test
  public void testBase() throws IOException {
	  try
	  {
	  prop=new Properties();
	  FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources"+"\\Config.Properties");
	  prop.load(ip);
	  }
	  catch(FileNotFoundException e)
	  {
		  e.printStackTrace();
	  }
	  catch(IOException e)
	  {
		  e.printStackTrace();
	  }
	  
  }
  @AfterMethod()
  public void takesScreenShotOnFailure(ITestResult iTestResult) throws IOException {
	  if(iTestResult.getStatus()==iTestResult.FAILURE)
	  {
		  takesScreenShotOnFailure(iTestResult.getName());
		  
	  }
	  
	  
  }

  private String takesScreenShotOnFailure(String name) throws IOException {
	  String dateName=new SimpleDateFormat("YYMMddmmhhss").format(new Date());
	  File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  String destination=System.getProperty("user.dir")+"\\target\\"+name+dateName+".png";
	  File finaldestination=new File(destination);
	  FileUtils.copyFile(source,finaldestination);
	  return destination;
	
}
@BeforeTest(alwaysRun=true)
@Parameters("browser")

  public void beforeTest(String browser) throws Exception {
	
	testBase();
	if(browser.equalsIgnoreCase(Constats.CHROMEBROWSER))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase(Constats.EDGEBROWSER))
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	else if(browser.equalsIgnoreCase(Constats.FIREFOXBROWSER))
	{

		WebDriverManager.firefoxdriver().setup();
		  driver=new FirefoxDriver();
		
	}
	
	else
	{
		throw new Exception(Constats.BROWSERNOTCORRECT);
	}
	String baseurl=prop.getProperty("baseUrl");
	driver.get(baseurl);
	driver.manage().window().maximize();
	
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  
  }
}
