package Arraylistandpractise;

public class Tryandcatch {
    public static void main(String args[]){
//        int arr[]= {10,20,30};
//
//        try{
//            System.out.println(arr[5]);
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Array size is 3");
//        }
//        finally{
//            System.out.println("code is ended");
//        }

        int a = 20;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        }
        catch (ArithmeticException s){
            System.out.println("any digit is not divisible by zero");
        }
        finally {
           int c = 20/10;
           System.out.println(c);

        }
        System.out.println("code ended");
    }

}
