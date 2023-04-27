package MyLearning;

public class Rotationofstring {
    public static void main(String ars[]){

       if( checkcondition())
        {
            System.out.println("Str1 is rotation of str2");
        }
        else{
            System.out.println("strings are not rotating string ");
        }
    }
    public static boolean checkcondition(){
        String str1 = "dhruti";
        String str2 = "rutijh";
        if(str1.length() != str2.length()){
            return false;

        }
        else{
            String s3 = str1 + str1;
            System.out.println(s3);
            if(s3.contains(str2)){
                return true;

            }
            else{
                return false;
            }
        }


    }
}
