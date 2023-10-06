package ExcelSheetProblems;

public class OverRiddingProblem {
   public int sum(int x , int y){
    int result = x +y;
   return  result;
   }
   public double sum( int x , int y, int z){
       int res = x +y+z;
      return res;
   }
   public static  void main(String args[]){
       OverRiddingProblem over= new OverRiddingProblem();
       System.out.println(over.sum(4 ,5 , 9));
   }
}
