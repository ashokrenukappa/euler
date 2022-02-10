package com.aaak.euler.util;

public class SafeNumberParser {

    public static int getIntAt(String [] args, int index, int defaultV){
        if(args.length > index){
            return parseInt(args[index], defaultV);
        }
        return defaultV ;
    }

    public static long getLongAt(String [] args, int index, long defaultV){
        if(args.length > index){
            return parseLong(args[index], defaultV);
        }
        return defaultV ;
    }

    public static int parseInt(String s){
        return parseInt(s, -1);
    }

    public static int parseInt(String s, int defaultV){
        int value = defaultV;
        try {
            value = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            //Ignore
        }
        return value;
    }

    public static long parseLong(String s){
        return parseLong(s, -1);
    }

    public static long parseLong(String s, long defaultV){
        long value = defaultV;
        try {
            value = Long.parseLong(s);
        } catch (NumberFormatException e) {
            //Ignore
        }
        return value;
    }
}
