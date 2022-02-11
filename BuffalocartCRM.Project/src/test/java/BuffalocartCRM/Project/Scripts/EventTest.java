package BuffalocartCRM.Project.Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BuffalocartCRM.Constants.Constats;
import BuffalocartCRM.Pages.EventPage;

public class EventTest extends TestBase{
	EventPage objevent;
	
  @Test(priority=9)
  public void verifyEvents() {
	  objevent=new EventPage(driver);
	  objevent.events();
	  String s="Events | Demo- Project Manager";
	  String title=driver.getTitle();
	  Assert.assertSame(title,s ,"matched");
	 
  }
  @Test(priority=10)
  public void verifyManage() {
	  objevent=new EventPage(driver);
	  
	 boolean s =objevent.manageLabels();
	 SoftAssert soft=new SoftAssert();
	soft.assertNotNull(driver);
	  
	  soft.assertTrue(s);
	  soft.assertAll();
  }
  @Test(priority=11)
  public void verifyAddEvent() throws InterruptedException
  {
	  objevent=new EventPage(driver);
	
	 boolean s= objevent.addEvent();
	 Assert.assertNotNull(s);
  }

}

