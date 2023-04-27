package Package2array;

public class ReplaceCharAtAnyPosi {
    public static void main(String args[]){
        String s = "geeks for geeks";
        int pos = 5;
        char ch = 'd';
        String str = " ";

        char c [] = s.toCharArray();
        c[5] = 'd';

        for(int i = 0 ; i<s.length() ; i++){
            str = str+c[i];
        }
        System.out.println(str);

//        String st = "geeks for geks";
//        int index = st.indexOf(6);
//        System.out.println(index);
//        String  str = "_";
//        for(int i = 0 ; i<s.length() ; i++){
//            st.charAt(i) = str.charAt(i);
//        }
//
//        for(int i= 0 ; i<st.length() ; i ++){
//           pos = st.indexOf("_") ;
//
//        }
//        System.out.println(pos);





    }
}
