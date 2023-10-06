package JavaAssignment_;

public class SubString_ {
    static boolean checkEquality(String s)
    {
        return(s.charAt(0)==s.charAt(s.length()-1));
    }
    static int countString(String s)
    {
        int result=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            for(int len=1;len<=n-i;len++)
            {
                if(checkEquality(s.substring(i,i+len)))
                {
                    result++;
                }
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        String s1="madam";
        String s2="madamiamadam";
        String s3="abracadabra";

        System.out.println(countString(s1));
        System.out.println(countString(s2));
        System.out.println(countString(s3));
    }
}
