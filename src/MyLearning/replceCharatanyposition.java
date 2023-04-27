package MyLearning;

public class replceCharatanyposition {
    public static void main(String args[]) {
        String s = "saturday";
        char arr[] = new char[s.length()];
         for(int i = 0 ; i<s.length() ; i++){
             arr[i]= s.charAt(i);

         }
        System.out.println(arr);
         arr[1] = 'd';
         String str = " ";
         for(int i = 0 ; i<arr.length ; i++){
             str+=arr[i];

         }
         System.out.println(str);


    }
//        String str = "Delight moon";
//        char ch = '_';
//        int pos = 7;
//        char[] cat = str.toCharArray();
//        cat[pos] = ch;
//        str =String.valueOf(cat);
//
//        System.out.println(str);


//    }
}











