package com.aaak.euler.util;

public class StringUtil {

    // Intentionally not used StringBuilder / StringBuffer
    public static String reverse(String input){
        char[] in = input.toCharArray();
        char[] out = new char[input.toCharArray().length];
        int begin=0;
        int end=in.length-1;
        while(begin < in.length){
            out[begin++] = in[end--];
        }
        return new String(out);
    }

    public static boolean isPalindrome(String s){
        if(s == null || s.equals("")){
            return false;
        }
        return s.equals(reverse(s));
    }


}
