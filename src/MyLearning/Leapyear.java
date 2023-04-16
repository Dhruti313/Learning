package MyLearning;

public class Leapyear {
    public static boolean check(){
        int d = 1700;

        if(d%100 ==0){
            if(d %4 ==0){
                return true;
            }
        }
        else if (d %4 ==0) {
            return true;

        }

        return false;
    }
    public static void main(String args[]){
        System.out.println(check());


    }
}
