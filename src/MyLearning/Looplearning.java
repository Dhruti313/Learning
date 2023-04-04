package MyLearning;

public class Looplearning {
    public static void main(String [] args){
        int a = 1;
        int b = 2;


        System.out.println(a);
        System.out.println(b);


         for(int n = 0; n <5 ; n++){
             int result = a +b;

             a = b;
             b = result;
             System.out.println(result);


         }
    }
}
