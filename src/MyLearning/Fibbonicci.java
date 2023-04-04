package MyLearning;

public class Fibbonicci {
    public static void main(String [] args)
    {
        int a = 1;
        int b = 2;
        int n = 5;
//        int count = 2;


//        System.out.println(a);
//        System.out.println(b);

//        while(count < 5){
//            int result = a +b;
//
//          a = b;
//          b = result;
//
//
//          System.out.println(result);
//          count++;
//
//
//
//
//        }

        for(int i = 0 ; i <n ; i++){
            int result = a  + b ;
            a = b;
            b = result;

            System.out.println(result);
        }
    }

}
