package MyLearning;

public class RevrseStar {
    public static void main(String[] args){
        int n = 4;

        for(int i = 0 ; i <=n ; i++){
            for(int j = n ; j<=i+1 ; j++){
               if(i<=n && j<=i){
                   System.out.print(" ");
               }
               else{
                   System.out.print("*");
               }
            }
            System.out.println();
        }
    }
}
