/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nathaniel.daley.date.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author ndaley
 */
public class DateUtilities {
    private static final String STANDARD_DATE = "MM/dd/yyyy";
    private static final String DATE_TIME_STANDARD = "MM/dd/yyyy hh:mm a";
    private static final String DATE_TIME_MILITARY = "MM/dd/yyyy kk:mm a";
    
    public static Date now() {
        return Calendar.getInstance().getTime();
    }
    
    public static String dateToString(Date d){
        String format = STANDARD_DATE;
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(d);
    }
    
    public static String dateToStandardDateTimeAsString(Date d){
        String format = DATE_TIME_STANDARD;
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(d);
    }
    
    public static String dateToMilitaryDateTimeAsString(Date d){
        String format = DATE_TIME_MILITARY;
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(d);
    }
}
