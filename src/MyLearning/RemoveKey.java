package MyLearning;

import javax.xml.transform.stream.StreamSource;
import java.util.HashMap;
import java.util.Map;

public class RemoveKey {




    public static void main(String[] args) {
        int arr[]= {1,1,2,3,3,4,5,6,6};
        int key = 5;

        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i<arr.length ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] ,map.get(arr[i])+1);
            }
            else{
                if(arr[i]!=key){
                    map.put(arr[i] , 1);
                }


            }
        }
        System.out.println();
        for(Map.Entry<Integer , Integer> e : map.entrySet()){
            System.out.print(e.getKey()+" ");
        }
    }
}
