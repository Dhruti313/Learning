package Leetcodeproblems;

import java.awt.*;

public class LongestPalindrome {
    public static void main(String args[]) {
        String s = "babad";
        if (s.length() <= 1) {
            String str = s;
            System.out.println(str);
        }
        int st = 0 ;
        int end = 0;
        int max_len = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            int l = i;
            int r = i;
            while (l >= 0 && r < s.length()) {
                if (s.charAt(l) == s.charAt(r)) {
                    l--;
                    r++;

                    break;
                } else {
                    break;
                }
            }
            int len = r - l -1;
            if(len > max_len){
                max_len = len;
                st = l +1;
                end = r-1;
            }
        }
        for (int i = 0; i < s.length() - 1; i++) {
            int l = i;
            int r = i + 1;
            while (l >= 0 && r < s.length()) {
                if (s.charAt(l) == s.charAt(r)) {
                    l--;
                    r++;
                   System.out.println(s.charAt(i));
                }
                else {
                    break;
                }

            }
            int len = r - l -1;
            if(len > max_len){
                max_len = len;
                st = l +1;
                end = r-1;
            }
        }
        System.out.println(s.substring(st, end));

    }


}