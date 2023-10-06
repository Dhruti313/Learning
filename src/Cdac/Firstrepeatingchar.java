package Cdac;

import java.util.LinkedHashMap;
import java.util.Map;

public class Firstrepeatingchar {

    public static void main(String args[]) {
        String s = "cdac banglore is nice place";
        char[] ch = s.toCharArray();

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(ch[i]) ) {
                System.out.print(ch[i]+ " ");
                break;
            }
            else{

                map.put(ch[i] , 1);
            }
        }
//        for(Map.Entry<Character , Integer> e : map.entrySet()){
//
////            System.out.print(e.getKey() );
//        }
    }
}
