package PracticeForJava;

public class Operators {
    public static void main(String args[]){
        int a = 10;
        int b = 10;

        if(a!=b){
            System.out.println("a and bare not same");
        }
        else {
            System.out.println("a and b are same");
        }
int c = a + a++ + ++a;
        System.out.println(c);

    }
}
