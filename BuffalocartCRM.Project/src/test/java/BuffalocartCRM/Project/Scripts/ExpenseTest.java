package BuffalocartCRM.Project.Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import BuffalocartCRM.Constants.Constats;
import BuffalocartCRM.Pages.ExpensesPage;

public class ExpenseTest extends TestBase {
	ExpensesPage obj;
  @Test(priority=20)
  public void verifyExpenses() {
	  obj=new ExpensesPage(driver);
	  obj.expenses();
	Assert.assertEquals(driver.getTitle(), Constats.EXPENSESTITLE);
  }
  @Test(priority=21)
  public void verifyMonthly() {
	  obj=new ExpensesPage(driver);
	  boolean s=obj.month();
	  Assert.assertTrue(s);
  }
  @Test(priority=22)
  public void verifyYearly() {
	  obj=new ExpensesPage(driver);
	  boolean s=obj.year();
	  Assert.assertTrue(s);
  }
  @Test(priority=23)
  public void verifycustom() {
	  obj=new ExpensesPage(driver);
	  boolean s=obj.custom();
	  Assert.assertTrue(s);
  }
  @Test(priority=24)
  public void verifyRecurring() {
	  obj=new ExpensesPage(driver);
	  boolean s=obj.recurring();
	  Assert.assertTrue(s);
  }
  @Test(priority=25)
  public void verifySummary() {
	  obj=new ExpensesPage(driver);
	  boolean s=obj.summary();
	  Assert.assertTrue(s);
  }
  @Test(priority=26)
  public void verifyChart() {
	  obj=new ExpensesPage(driver);
	  boolean s=obj.chart();
	  Assert.assertTrue(s);
  }
}
