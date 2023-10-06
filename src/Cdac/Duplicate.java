package Cdac;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Duplicate {
    public static void main(String args[]) {
        String s = "cdac banglore is nice place";
        char[] ch = s.toCharArray();
        String j = " ";

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(ch[i])|| Character.isWhitespace(ch[i]) ) {
               continue;
            }
            else{

                map.put(ch[i] , 1);

            }

        }
        for(Map.Entry<Character , Integer> e : map.entrySet()){

            System.out.print(e.getKey() +" " );
        }
    }
}
