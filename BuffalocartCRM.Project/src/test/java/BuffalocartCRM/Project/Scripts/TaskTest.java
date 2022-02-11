package BuffalocartCRM.Project.Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BuffalocartCRM.Constants.Constats;
import BuffalocartCRM.Pages.TaskPage;

public class TaskTest extends TestBase{
	TaskPage objtask;
	
  @Test(priority=12)
  public void verifyTask() {
	  objtask=new TaskPage(driver);
	  objtask.taskPage();
 Assert.assertEquals(driver.getTitle(), Constats.TASKTITLE);
	 
  }
 
  @Test(priority=13)
  public void verifyAddMultipleTask() {
	  objtask=new TaskPage(driver);
	 String s= objtask.addMultipleTask();
	 String o="Add multiple tasks";
	  Assert.assertSame(s, o);
	 }
  @Test(priority=15)
  public void verifyKanban() throws InterruptedException {
	  objtask=new TaskPage(driver);
	  Thread.sleep(4000);
	 boolean s= objtask.kanban();
	 SoftAssert soft=new SoftAssert();
	 soft.assertNotNull(soft);
	 soft.assertAll();
	}
  @Test(priority=16)
  public void verifyGantt() throws InterruptedException {
	  objtask=new TaskPage(driver);
	  Thread.sleep(4000);
	 boolean s= objtask.gantt();
	  Assert.assertTrue(s);
	  }
  }

