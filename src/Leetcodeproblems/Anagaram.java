package Leetcodeproblems;

import java.util.HashMap;

public class Anagaram {
    public static void main(String args[]) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(anagaramCheck(s, t));
    }
    public static boolean anagaramCheck(String s, String t) {
        char ch[] = s.toCharArray();
        char ch2[] = t.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        if (ch.length == ch2.length) {
            for (int i = 0; i < ch.length; i++) {
                if (!map.containsKey(ch[i])) {
                    map.put(ch[i], 1);
                }
            }
            for (int i = 0; i < ch2.length; i++) {
                if(map.containsKey(ch2[i])) {
                    if (map.get(ch2[i]) == 1) {
                        map.remove(ch2[i]);
                    } else {
                        map.put(ch2[i], map.get(ch2[i] - 1));
                    }
                }
                else {
                    return false;
                }
            }

            if (map.size()==0) {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }
}




