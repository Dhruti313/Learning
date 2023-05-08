package LearningNew;

public class CompoundInt {
    public static void main(String args[]){
        double principal = 10000;
        double rate = 8.1;
        int time = 2;

        double CI = principal *(Math.pow((1 + rate/100) , time));
        System.out.print(CI);

    }
}
