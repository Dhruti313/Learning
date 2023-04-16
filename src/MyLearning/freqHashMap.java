package MyLearning;

import java.util.HashMap;
import java.util.Map;

public class freqHashMap  {
    public static void main(String args[]){
        int arr[] = {1,1,2,2,3,3,4,5,6,7};

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i<arr.length ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);

            }
            else{
                map.put(arr[i],1);
            }
        }
        int arr2 =0;
//        System.out.print("[");
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
//            System.out.print(e.getKey()+", ");
//             arr2 = e.getKey();

            if(arr2==4){
                System.out.println(e.getKey());
            }
            arr2 +=1;


        }
//        System.out.print("]");
//        System.out.println(arr2 );


        

    }
}
