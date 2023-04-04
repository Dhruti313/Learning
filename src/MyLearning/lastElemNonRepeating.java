package MyLearning;

import java.util.HashMap;
import java.util.Map;

public class lastElemNonRepeating {
    public static void main(String args[]) {
        Character arr[] = {'A', 'B', 'C', 'A', 'B', 'Z', 'S', 'T'};
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);

            } else {
                map.put(arr[i], 1);
            }
        }
        for(Map.Entry<Character,Integer> e : map.entrySet()){
          System.out.println(e.getKey() +" " +e.getValue());
            if(e.getValue()==1){
                temp++;
                if(temp ==4){
                    System.out.println(e.getKey());
                }

            }
        }
    }
}
