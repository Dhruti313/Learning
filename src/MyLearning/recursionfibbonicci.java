package MyLearning;

public class recursionfibbonicci {
    static int a= 0 ,b = 1;
    public static void printfib(int i){

        int c;

        if(i>=1){
            c= a+b;
            System.out.println(c);
            a= b;
            b= c;
            printfib(i-1);
        }
    }
    public static void main(String args[]){

        printfib(5);
    }
}
