package BuffalocartCRM.Project.Scripts;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import BuffalocartCRM.Constants.Constats;
import BuffalocartCRM.Pages.NotesPage;

public class NotesTest extends TestBase{
	NotesPage obj;
  @Test(priority=17)
  public void verifyNotes() throws InterruptedException {
	  obj=new NotesPage(driver);
	  obj.notes();
	 boolean s= obj.search();
	  Assert.assertEquals(driver.getTitle(),Constats.NOTES);
	  }
  @Test(priority=18)
  public void verifyManage() throws InterruptedException {
	  obj=new NotesPage(driver);
	  boolean s= obj.manage();
	  Assert.assertTrue(s);
  }
  @Test(priority=19)
  public void verifyAdd() throws InterruptedException {
	  obj=new NotesPage(driver);
	  boolean s= obj.add();
	  Assert.assertTrue(s);
  }
}
