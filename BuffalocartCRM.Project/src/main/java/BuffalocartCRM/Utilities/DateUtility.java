package BuffalocartCRM.Utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtility {
	public static String daysFromCalendarDate(int offsetInDays, String dateFormat){
	    Calendar calendar= Calendar.getInstance();
	    calendar.add(Calendar.DAY_OF_MONTH, offsetInDays);
	    SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
	    String newDate = sdf.format(calendar.getTime());
	    return newDate;
	}
	public static String getLastWorkingDayOfPrevMonth(String strDateFormat){
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH,-1);
        int lastDate = cal.getActualMaximum(Calendar.DATE);
        cal.set(Calendar.DATE,lastDate);
        int lastDay = cal.get(Calendar.DAY_OF_WEEK);
        switch(lastDay){
            case 1:
                cal.add(Calendar.DAY_OF_MONTH,-2);
                return sdf.format(cal.getTime());
            case 2:
                cal.add(Calendar.DAY_OF_MONTH,-1);
                return sdf.format(cal.getTime());
            default:
                return sdf.format(cal.getTime());
        }
      
        }
    }



