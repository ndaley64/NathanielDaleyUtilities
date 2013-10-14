/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nathaniel.daley.date.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author ndaley
 */
public class DateUtilities {
    private static final String STANDARD_DATE = "MM/dd/yyyy";
    private static final String DATE_TIME_STANDARD = "M/d/yyyy hh:mm a";
    private static final String DATE_TIME_MILITARY = "M/d/yyyy kk:mm a";
    
    public static Date now() {
        return Calendar.getInstance().getTime();
    }
    
    public static String dateToString(Date d){
        String format = STANDARD_DATE;
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(d);
    }
    
    public static String dateToDateWithStandardTimeAsString(Date d){
        String format = DATE_TIME_STANDARD;
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(d);
    }
    
    public static String dateToDateWithMilitaryTimeAsString(Date d){
        String format = DATE_TIME_MILITARY;
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(d);
    }
    
    public static Date toDate(String date, String format) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        
        return sdf.parse(date);
    }
    
    public static void main(String[] args) {
        DateUtilities utilities = new DateUtilities();
        String dateString = "10/1/2012 09:58:22 PM";
        String dateFormat = "M/d/yyyy hh:mm:ss a";
        try{
            toDate(dateString, dateFormat);
        }catch( ParseException pe){
            System.err.println("String does not match the entered date format.");
        }
    }
}
