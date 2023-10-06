package PracticeForJava;

public class SubString {
    public static void main(String args[]){
        String s1 = "abc";
        String s2 = "fgfgfgabc";
       System.out.println(substring(s1 , s2));
    }
    public static boolean substring(String s1 , String s2){
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        int i = 0 ;
        int j =0;

        while (i<c1.length && j <c2.length){
            if(c1[i] == c2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        if(i == c1.length){
            return true;
        }
        else{
            return false;
        }
    }

}
