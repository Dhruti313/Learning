package Package2array;

public class Lexographically {
    public static void main(String args[]) {
        String s1 = "Geeks";
        String s2 = "Geeks";
        String s3 = "Practice";
        String s4 = "god";
        System.out.println(compare(s1 , s3 ));
       System.out.println(compare(s4 , s1));
    }
    public static int compare(String s1, String s2){
        if(s1.length() == s2.length()){
            for(int i = 0 ; i<s1.length() ; i ++){
                if(s1.charAt(i) != s2.charAt(i)){
                     return 3;
                }
            }
            return 0;
        }
        else if(s1.length()< s2.length()){
            return -1;
        }
        else{
            return 1;
        }
    }
}
