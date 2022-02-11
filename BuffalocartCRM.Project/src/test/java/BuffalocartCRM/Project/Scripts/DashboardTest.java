package BuffalocartCRM.Project.Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import BuffalocartCRM.Constants.Constats;
import BuffalocartCRM.Pages.DashBoardPage;
import BuffalocartCRM.Utilities.WaitUtilities;

public class DashboardTest extends TestBase {
	DashBoardPage objdash;
	
  @Test(priority=5)
  public void verifydashboardPage() {
	  objdash=new DashBoardPage(driver);
	  objdash.dashBoard();
	  Assert.assertEquals(driver.getTitle(),Constats.DASHBOARDTITLE);
	  
  }
  @Test(priority=6)
  public void verifytest() throws InterruptedException {
	  objdash=new DashBoardPage(driver);
	  objdash.testPage();
	  
	  Assert.assertEquals(driver.getTitle(),Constats.PROJECTTITLE);
	 objdash.dashBoard();
	 
  }
  @Test(priority=7)
  public void verifyNewPosts() throws InterruptedException {
	  objdash=new DashBoardPage(driver);
	  objdash.posts();
	  String url="http://buffalocart.com/demo/crm/";
	  String currenturl=driver.getCurrentUrl();
	  Assert.assertNotSame(url,currenturl);
	  objdash.dashBoard();
	  
  }
  @Test(priority=8)
  public void verifyEvents() throws InterruptedException {
	  objdash=new DashBoardPage(driver);
	 objdash.event();
	  Assert.assertNotNull(driver);
	  
  }
}
