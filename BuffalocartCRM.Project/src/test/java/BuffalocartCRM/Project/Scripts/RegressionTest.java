package BuffalocartCRM.Project.Scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BuffalocartCRM.Constants.Constats;
import BuffalocartCRM.Pages.DashBoardPage;
import BuffalocartCRM.Pages.LoginPage;
import BuffalocartCRM.Utilities.ExcelRead;

public class RegressionTest extends TestBase{
	LoginPage objLogin;
	DashBoardPage objdash;
	 @Test(dataProvider="validuserInvalidpass",priority=1)
	  public void verifyLoginWithValidusernameInvalidpassword(String user,String pass) throws IOException, InterruptedException {
		  objLogin=new LoginPage(driver);

		  objLogin.setUsername(user);

		  objLogin.setPassword(pass);
		  objLogin.signIn();
		  String title=driver.getTitle();
		  SoftAssert soft=new SoftAssert();
		  soft.assertNotEquals(title,Constats.EVENTITLE, "error message");
		  soft.assertNotNull(driver, "driver is not null");
		  soft.assertAll();
		  objLogin.clearData();
		  }
	 @Test(dataProvider="validuserValidpass",priority=2)
	  public void verifyLoginWithValidusernameValidpassword(String user,String pass) throws IOException, InterruptedException {
		  objLogin=new LoginPage(driver);
		  objLogin.setUsername(user);
		  objLogin.setPassword(pass);
		  objLogin.signIn();
		 
		  Assert.assertEquals(objLogin.getHomePageTitle(),Constats.HOMEPAGETITLE1);
		  
	  }
	 @DataProvider
	  public Object[][] validuserInvalidpass() throws EncryptedDocumentException, InvalidFormatException, IOException
	  {
		  Object[][] data=ExcelRead.getDataFromExcel(Constats.Loginfilepath,"validuserinvalidpass");
		  return data;
	  }
@DataProvider
	  public Object[][] validuserValidpass() throws EncryptedDocumentException, InvalidFormatException, IOException
	  {
		  Object[][] data=ExcelRead.getDataFromExcel(Constats.Loginfilepath,"validuservalidpass");
		  return data;
	  }
	 
}

