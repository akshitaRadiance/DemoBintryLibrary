package com.timeutil;

import java.util.Calendar;

public class TimeCurrent {

    public static long getCurrentTime() {
        Calendar calendar = Calendar.getInstance();
        return calendar.getTimeInMillis();
    }
}
