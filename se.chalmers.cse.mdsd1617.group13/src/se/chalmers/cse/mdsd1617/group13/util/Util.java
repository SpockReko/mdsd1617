package se.chalmers.cse.mdsd1617.group13.util;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Simple utility class to perform some tasks
 */
public class Util {

    public final static String DATE_FORMAT = "YYYYMMDD";

    private Util() {
        // no need to instantiate this class
    }

    /**
     * Parse a date
     *
     * @param dateToParse the date in string
     * @return
     */
    public static Date parseDate(String dateToParse) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT, Locale.ENGLISH);
        try {
            return simpleDateFormat.parse(dateToParse);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

}
