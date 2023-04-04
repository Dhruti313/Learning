package MyLearning;

public class rotatestrng {
    public static boolean main(String args[]){
        String s = "abcde";
        String goal = "cdeab";

        if(s.length() == goal.length() && (s + s).contains(goal)){
            return (true);
        }
        return (false);
    }

}
