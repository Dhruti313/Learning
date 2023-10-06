package ExcelSheetProblems;

public class OverLoading {
    void sum(int x , int y){
        int res = x+y;
        System.out.println(res);
    }
    void sum( int x , int y , int z){
        int res = x+y +z;
        System.out.println(res);
    }
    public  static void main(String args[]){
        OverLoading over = new OverLoading();
        over.sum(3,4);
        over.sum(3,4,5);
    }
}
