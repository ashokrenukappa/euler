package com.aaak.euler.util;

import java.util.concurrent.TimeUnit;

public class TimeUtil {

    final static long SECOND = 1000;
    final static long MINUTE = SECOND * 60;
    final static long HOUR = MINUTE * 60;

    private TimeUtil() {
    }

    public static String friendlyTime(long timeInMillis) {
        String timeString = timeInMillis +"";

        if (timeInMillis <= SECOND) {
            timeString = String.format("%d ms", timeInMillis);
        } else if (timeInMillis < MINUTE) {
            timeString = String.format("%d s",
                    TimeUnit.MILLISECONDS.toSeconds(timeInMillis) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(timeInMillis))
            );
        } else if (timeInMillis < HOUR) {
            timeString = String.format("%d m, %d s",
                    TimeUnit.MILLISECONDS.toMinutes(timeInMillis),
                    TimeUnit.MILLISECONDS.toSeconds(timeInMillis) -
                            TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(timeInMillis))
            );
        } else {
            timeString = String.format("%d h, %d m, %d s",
                    TimeUnit.MILLISECONDS.toHours(timeInMillis),
                    TimeUnit.MILLISECONDS.toMinutes(timeInMillis) -
                            TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(timeInMillis)),
                    TimeUnit.MILLISECONDS.toSeconds(timeInMillis) -
                            TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(timeInMillis))
            );
        }
        return timeString;
    }
}
