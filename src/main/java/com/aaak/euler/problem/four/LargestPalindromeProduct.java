package com.aaak.euler.problem.four;

import com.aaak.euler.util.StringUtil;

public class LargestPalindromeProduct {

    public static void main(String [] args){
        long maxPalindrome = 0;
        for(int i=999;i>=100;i--){
            for(int j=999;j>=100;j--){
                long product = i * j;
                if(StringUtil.isPalindrome(product+"")){
                    if(maxPalindrome < product){
                        maxPalindrome = product;
                    }
                }
            }
        }
        System.out.println(maxPalindrome);
    }
}
