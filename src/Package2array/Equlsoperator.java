package Package2array;

public class Equlsoperator {
    public static void main(String args[]){
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        System.out.println(s1==s2);  //the result is true as both have the same
        // addresses in the string constant pool.
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));  //Using equals, the result is true because
        // it’s only comparing the values given in s1 and s2.
    }
}
