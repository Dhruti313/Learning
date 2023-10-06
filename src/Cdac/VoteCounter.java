package Cdac;


    import java.util.HashMap;
import java.util.Map;




public class VoteCounter {
    public static void main(String[] args){
        String[] votes = {"ABC", "CBA", "DAC", "AHY", "YBA", "YDC", "YDC"};
        int[] weights = {3, 2, 1};
        totalVotes(votes , weights);

    }
    public static void totalVotes(String []votes , int[] weights){
        int weightIndex=0;

        HashMap<Character , Integer> map = new HashMap<>();
        for(int i= 0; i <votes.length ; i++){

                for (char c : votes[i].toCharArray()) {

                    map.put(c, map.getOrDefault(c, 0) + weights[weightIndex]);
                    weightIndex = (weightIndex + 1) % weights.length;
                }

        }
        int maxValue = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
          if(entry.getValue() >maxValue){
              maxValue= entry.getValue();
          }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue()==maxValue){
                System.out.println("winner is " + entry.getKey() + " with " + entry.getValue() + " votes ");
            }
        }
    }
}
