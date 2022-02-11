package BuffalocartCRM.Project.Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import BuffalocartCRM.Constants.Constats;
import BuffalocartCRM.Pages.DashBoardPage;
import BuffalocartCRM.Pages.LoginPage;


public class SanityTest extends TestBase {
	LoginPage objLogin;
	DashBoardPage objdash;
	@Test(priority=3)
	  public void verifydashboardPage() {
		  objdash=new DashBoardPage(driver);
		  objdash.dashBoard();
		  Assert.assertEquals(driver.getTitle(),Constats.DASHBOARDTITLE);
		  
	  }
	  @Test(priority=4)
	  public void verifytest() throws InterruptedException {
		  objdash=new DashBoardPage(driver);
		  objdash.testPage();
		  
		  Assert.assertEquals(driver.getTitle(),Constats.PROJECTTITLE);
		 objdash.dashBoard();
		 
	  }
}