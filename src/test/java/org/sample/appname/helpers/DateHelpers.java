package org.sample.appname.helpers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelpers {
    public static String getDate(String format) {
        DateFormat dateformat = new SimpleDateFormat(format);
        return dateformat.format(new Date());
    }
}
