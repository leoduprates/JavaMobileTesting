package com.example.testautomation.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static String getDate(String format) {
        DateFormat date = new SimpleDateFormat(format);
        return date.format(new Date());
    }
}
